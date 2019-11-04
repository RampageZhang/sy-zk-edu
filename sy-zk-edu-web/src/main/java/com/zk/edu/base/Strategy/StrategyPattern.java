package com.zk.edu.base.Strategy;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class StrategyPattern {


    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());

        context.getStrategyMethod();

        System.out.println("---------------------");

        context.setStrategy(new ConcreteStrategyB());

        context.getStrategyMethod();

    }
}
