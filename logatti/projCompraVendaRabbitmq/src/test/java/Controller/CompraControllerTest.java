package Controller;

import br.com.projrabbit.MyApplication;
import br.com.projrabbit.model.Compras;
import br.com.projrabbit.service.ComprasService;
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
public class CompraControllerTest {

    @Autowired
    private ComprasService comprasService;

    @Test
    public void save() throws Exception {
        long qtd = 200;

        comprasService.deleteAll();

        for (int i = 1; i <= qtd; i++) {
            comprasService.sendComprasRabbit(new Compras("compra"+i));
        }

        Thread.sleep(5000);
        List<Compras> lst = comprasService.findAll();
        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }
}
