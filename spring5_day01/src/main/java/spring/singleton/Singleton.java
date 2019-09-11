package spring.singleton;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description  饿汉式单例
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton(){
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
    }
}
