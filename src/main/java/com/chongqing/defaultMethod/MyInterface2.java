package com.chongqing.defaultMethod;

public interface MyInterface2 {
    default void myMethod(){
        System.out.println("MyInterface1");
    }
}
