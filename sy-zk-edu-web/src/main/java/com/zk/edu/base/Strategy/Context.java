package com.zk.edu.base.Strategy;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class Context {

    private  Strategy strategy;

    public void setStrategy( Strategy strategy){
        this.strategy = strategy;
    }

    public Strategy getStrategy(){
        return  strategy;
    }

    public  void getStrategyMethod(){
        strategy.getStrategyMethod();
    }


}
