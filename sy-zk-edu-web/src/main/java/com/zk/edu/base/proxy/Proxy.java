package com.zk.edu.base.proxy;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class Proxy implements Subject {


    private  RealSubject realSubject ;

    @Override
    public void request() {

        if(realSubject == null ){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        afterRequest();
    }


    private void preRequest(){
        System.out.println("预处理");
    }


    private void afterRequest(){
        System.out.println("处理完成");
    }


}
