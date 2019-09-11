package spring.singleton;

import java.util.HashMap;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public class Demo2 {
    public static void main(String[] args) {
        int i = 20;
        System.out.println(i);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("zhangsan",20);
        hashMap.put("wangsan",25);
        for (String s : hashMap.keySet()) {
            System.out.println("s = " + s);
        }
    }
}
