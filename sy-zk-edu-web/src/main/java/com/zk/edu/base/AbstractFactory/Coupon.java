package com.zk.edu.base.AbstractFactory;

/**
 * Created by zhangkun on 2019-12-11.
 */
public class Coupon implements Rights {

    @Override
    public  void query(){

        System.out.println("aaaaa");
    }

    @Override
    public void get(){

    }

    @Override
    public void verify(){

    }

    public void verifyaa(){

        System.out.println("shishis");
    }
}
