package com.zk.edu.base.TemplateMethod;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class HookConcreteClass extends HookAbstractClass {

    @Override
    public void hookMethod1(){
        System.out.println("钩子方法1被重写...");
    };

    @Override
    public boolean hookMethod2(){
        return false;
    };

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
