package com.zk.edu.base.Strategy;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class ConcreteStrategyB implements  Strategy {
    @Override
    public void getStrategyMethod() {
        System.out.println("我是策略B");
    }
}
