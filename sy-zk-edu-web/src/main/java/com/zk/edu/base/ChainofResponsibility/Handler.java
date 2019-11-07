package com.zk.edu.base.ChainofResponsibility;

/**
 * Created by zhangkun on 2019-11-07.
 */
abstract class Handler {


    Handler next ;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

public  abstract void handleRequest(String request);

}
