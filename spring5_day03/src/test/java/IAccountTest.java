import cn.itcst.spring.IAccountService;
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
public class IAccountTest {

    @Autowired
    private IAccountService iAccountService;


    @Test
    public void  test(){
        iAccountService.transf("tom","jack",100d);
        System.out.println("转账成功");
    }
}
