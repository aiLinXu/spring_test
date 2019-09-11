package cn.itcast.spring.aspect;

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
@Component("myAspect")
@Aspect
public class MyAspect {

    @Around("bean(*Service)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕发放执行  前");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕发放执行  后");

        return proceed;
    }
}
