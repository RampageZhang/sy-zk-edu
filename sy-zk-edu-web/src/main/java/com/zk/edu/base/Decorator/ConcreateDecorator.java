package com.zk.edu.base.Decorator;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class ConcreateDecorator extends Decorator {

    public ConcreateDecorator(Component component) {
        super(component);
    }

    @Override
    public void  operation(){
        component.operation();
        addFunction();

    }

    public void  addFunction(){
        System.out.println("为组件增加额外的功能");
    }
}
