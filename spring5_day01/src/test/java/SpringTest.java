import cn.itcast.springAop.ICustomerService;
import cn.itcast.springAop.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private ICustomerService iCustomerService;

    @Test
    public void test(){
        productService.save();
        productService.find();

        iCustomerService.save();
        iCustomerService.find();
    }



}
