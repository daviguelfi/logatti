package Controller;


import br.com.projrabbit.MyApplication;
import br.com.projrabbit.model.Produtos;
import br.com.projrabbit.service.ProdutosService;
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
public class ProdutoControllerTest {

    @Autowired
    private ProdutosService produtosService;

    @Test
    public void save() throws Exception {
        long qtd = 200;

        produtosService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            produtosService.sendProdutoRabbit(new Produtos("produto"+i) );
        }

        Thread.sleep(5000);
        List<Produtos> lst = produtosService.findAll();
        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }
}
