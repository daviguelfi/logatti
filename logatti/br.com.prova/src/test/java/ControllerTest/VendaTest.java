package ControllerTest;

import br.com.prova.MyApplication;
import br.com.prova.model.Venda;
import br.com.prova.service.VendaService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)
@WebAppConfiguration
public class VendaTest {
    @Autowired
    private VendaService vendaService;

    @Test
    public void save() throws Exception {
        long qtd = 200;

        vendaService.deleteAll();

        for (int i = 1; i <= qtd; i++) {
            vendaService.sendClienteRabbit(new Venda("venda"+i));
        }

        Thread.sleep(6000);
        List<Venda> lst = vendaService.findAll();
        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }
}
