package com.zk.edu.base.Decorator;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class Decorator implements Component {

    Component component;

    public Decorator(Component component){
        this.component = component;

    }

    @Override
    public void operation() {
        component.operation();
    }
}
