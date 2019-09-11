package spring;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public interface IAccountService {
    /**
     * 转账
     * @param outName
     * @param inName
     * @param money
     */
    public void transf(String outName, String inName, Double money);
}
