package spring.singleton;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description  懒汉式单例书写
 **/
public class SingletonDemo {
    private static SingletonDemo singletonDemo = null;

    public SingletonDemo() {
    }

    public static SingletonDemo getSingletonDemo(){
        if (singletonDemo == null) {
            singletonDemo = new SingletonDemo();
        }
        return singletonDemo;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo.getSingletonDemo());
    }

}
