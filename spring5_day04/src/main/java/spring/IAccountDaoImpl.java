package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Repository("iAccountDao")
public class IAccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void in(String name, double money) {
        String sql="update t_account set money = money+ ? where name = ?";
        jdbcTemplate.update(sql, money,name);
    }


    public void out(String name, double money) {
        String sql="update t_account set money = money- ? where name = ?";
        jdbcTemplate.update(sql, money,name);
    }
}
