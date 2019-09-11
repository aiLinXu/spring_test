package cn.itcast.springAop;

import org.springframework.stereotype.Service;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

public interface ICustomerService {
    //保存
    public void save();
    //查询
    public int find();
}
