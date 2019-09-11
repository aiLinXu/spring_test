package cn.itcst.spring;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public class IAccountServiceImpl implements IAccountService {
    private IAccountDao iAccountDao;

    public void setiAccountDao(IAccountDao iAccountDao) {
        this.iAccountDao = iAccountDao;
    }


    @Override
    public void transf(String outName, String inName, Double money) {
        iAccountDao.out(outName,money);

        // int i = 1/0;
        iAccountDao.in(inName,money);
    }
}
