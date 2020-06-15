package com.chongqing.defaultMethod;
//myclass继承了接口1的实现类  实现了接口2, 接口1和接口2都一个同名的默认方法  那么myclass对象实例会调用接口1实现类的默认的方法
public class MyClass extends MyInterfaceImpl implements MyInterface2{
    //implements两个接口  有同名的默认方法   非要这么搞就得重写这个 方法
    /*public void myMethod(){
        System.out.println("myClass");
    }*/
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }


}
