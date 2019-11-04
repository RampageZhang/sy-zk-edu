package com.zk.edu.base.State;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class ConcreteStateA extends State{


    @Override
    public void Handler(Context context) {

        System.out.println("A");
        context.setState(new ConcreteStateB());
    }
}
