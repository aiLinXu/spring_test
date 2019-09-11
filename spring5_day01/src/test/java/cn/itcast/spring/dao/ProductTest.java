package cn.itcast.spring.dao;

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
public class ProductTest  {

    @Autowired
    private ProductService productServices;

    @Test
    public void test() {
        try {
            productServices.save();
        }catch (Exception e){
            System.out.println("出现问题了");
        }

    }
}
