package cn.itcast.springAop;

import org.springframework.stereotype.Service;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Service("ICustomerService")
public class ICustomerServiceimp implements ICustomerService {
    public void save() {
        System.out.println("数据被保存了");
    }

    public int find() {
        System.out.println("客户查询数量了");
        return 100;
    }
}
