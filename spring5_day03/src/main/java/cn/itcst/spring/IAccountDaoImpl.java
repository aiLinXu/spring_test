package cn.itcst.spring;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    @Override
    public void in(String name, double money) {
        String sql="update t_account set money = money+ ? where name = ?";
        super.getJdbcTemplate().update(sql, money,name);
    }



    @Override
    public void out(String name, double money) {
        String sql="update t_account set money = money- ? where name = ?";
        super.getJdbcTemplate().update(sql, money,name);
    }
}
