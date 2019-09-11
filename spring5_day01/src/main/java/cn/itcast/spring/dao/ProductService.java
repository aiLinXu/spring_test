package cn.itcast.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public void save() {
        System.out.println("service层进行了操作");
        productDao.save();


    }
}
