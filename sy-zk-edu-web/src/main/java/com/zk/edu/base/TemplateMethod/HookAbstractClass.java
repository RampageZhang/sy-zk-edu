package com.zk.edu.base.TemplateMethod;

/**
 * Created by zhangkun on 2019-11-04.
 */
public abstract  class HookAbstractClass {


    public void TemplateMethod(){

        abstractMethod1();
        hookMethod1();
        if(hookMethod2()){
            SpecificMethod();
        }
        abstractMethod2();
    }


    public void SpecificMethod() //具体方法
    {
        System.out.println("抽象类中的具体方法被调用...");
    }

    public void hookMethod1(){};

    public boolean hookMethod2(){
        return true;
    };


    abstract void abstractMethod1();

    abstract void abstractMethod2();

}
