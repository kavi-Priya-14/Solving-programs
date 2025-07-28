package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();  // Continue with method execution

        long end = System.currentTimeMillis();
        System.out.println("[LOG] " + joinPoint.getSignature() + " executed in " + (end - start) + " ms");
        return result;
    }
}
