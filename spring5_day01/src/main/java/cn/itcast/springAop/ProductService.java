package cn.itcast.springAop;

import org.springframework.stereotype.Service;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Service("productService")
public class ProductService {
    public void save(){
        System.out.println("数据被保存了");
    }

    public void find(){
        System.out.println("数据被发现了");
    }
}
