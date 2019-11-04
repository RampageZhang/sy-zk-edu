package com.zk.edu.base.TemplateMethod;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class HookTemplateMethod {


    public static void main(String[] args) {

        HookAbstractClass hookAbstractClass = new HookConcreteClass();
        hookAbstractClass.TemplateMethod();
    }
}
