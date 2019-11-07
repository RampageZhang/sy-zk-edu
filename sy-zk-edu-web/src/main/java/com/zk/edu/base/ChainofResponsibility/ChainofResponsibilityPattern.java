package com.zk.edu.base.ChainofResponsibility;

/**
 * Created by zhangkun on 2019-11-07.
 */
public class ChainofResponsibilityPattern {

    public static void main(String[] args) {

        //这个可以用来处理优惠券选取的问题
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("two");
    }

}
