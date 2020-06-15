package com.chongqing.defaultMethod;

public interface MyInterface {
    default void myMethod(){
        System.out.println("myInterface");
    }
}
