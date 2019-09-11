package cn.itcast.test.singleton;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description   饿汉式创建单例
 **/
public class Singleton1 {
    private final static Singleton1 singleton = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 singleton1(){
        return singleton1();
    }

}
