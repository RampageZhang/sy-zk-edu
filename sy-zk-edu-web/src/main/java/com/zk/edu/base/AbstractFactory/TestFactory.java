package com.zk.edu.base.AbstractFactory;

/**
 * Created by zhangkun on 2019-12-11.
 */
public class TestFactory {

    public static void main(String[] args) {

        String COUPON = "COUPON";
        Rights rights = RightsFactory.getInstance(COUPON);
        rights.verify();
        rights.get();
        rights.query();

    }
}
