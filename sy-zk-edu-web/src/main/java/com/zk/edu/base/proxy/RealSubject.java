package com.zk.edu.base.proxy;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class RealSubject implements  Subject {
    @Override
    public void request() {

        System.out.println("我是RealSubject");

    }
}
