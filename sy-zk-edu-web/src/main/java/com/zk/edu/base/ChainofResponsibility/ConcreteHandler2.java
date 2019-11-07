package com.zk.edu.base.ChainofResponsibility;

/**
 * Created by zhangkun on 2019-11-07.
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if("two".equals(request)){
            System.out.println("具体处理方法二");
        }else{

            if(getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没人处理了");
            }
        }
    }
}
