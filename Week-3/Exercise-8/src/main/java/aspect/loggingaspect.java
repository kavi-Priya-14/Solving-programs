package com.library.aspect;

public class LoggingAspect {
    public void logBefore() {
        System.out.println("[AOP] Before method execution");
    }

    public void logAfter() {
        System.out.println("[AOP] After method execution");
    }
}
