package cn.itcast.springAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;


/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public class TimeLogInterceptor implements MethodInterceptor {
    private static Logger logger = Logger.getLogger(TimeLogInterceptor.class);


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long starts = System.currentTimeMillis();

        Object proceed = methodInvocation.proceed();

        long ends = System.currentTimeMillis();

        System.out.println(ends-starts);
        return proceed;
    }
}
