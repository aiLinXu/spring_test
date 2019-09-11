package cn.itcst.spring;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public interface IAccountDao {
    /**
     * 转入
     * @param name
     * @param money
     */
    public void in(String name,double money);

    /**
     * 转出
     * @param name
     * @param money
     */
    public void out(String name,double money);
}
