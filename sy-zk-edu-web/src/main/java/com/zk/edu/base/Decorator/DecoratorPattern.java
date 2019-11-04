package com.zk.edu.base.Decorator;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class DecoratorPattern {

    public static void main(String[] args) {

        Component component = new ConcreateComponent();
        component.operation();
        System.out.println("---------------------");
        Component b = new ConcreateDecorator(component);
        b.operation();

    }
}
