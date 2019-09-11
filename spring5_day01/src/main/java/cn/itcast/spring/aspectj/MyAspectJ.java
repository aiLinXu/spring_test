package cn.itcast.spring.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Component("myAspectJ")
@Aspect
public class MyAspectJ {

    @Around(value = "bean(*Service)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("鐜粫閫氱煡鎵ц浜� 鍓�");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("鐜粫閫氱煡鎵ц浜� 鍚�");
        return proceed;
    }


}
