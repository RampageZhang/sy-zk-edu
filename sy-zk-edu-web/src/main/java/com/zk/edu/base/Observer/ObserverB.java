package com.zk.edu.base.Observer;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class ObserverB implements Observer {
    @Override
    public void response(String s) {
        System.out.println("我是观察者B,我看到："+s);
    }
}
