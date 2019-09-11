package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Service("iAccountService")
@Transactional
public class IAccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao iAccountDao;


    public void transf(String outName, String inName, Double money) {
        iAccountDao.out(outName,money);


        iAccountDao.in(inName,money);
    }
}
