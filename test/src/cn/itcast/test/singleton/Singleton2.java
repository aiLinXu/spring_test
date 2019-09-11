package cn.itcast.test.singleton;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description   懒汉式创建单例
 **/
public class Singleton2 {
    private static Singleton2 singleton2;

    public Singleton2() {
    }

    public static Singleton2 getInstance(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
