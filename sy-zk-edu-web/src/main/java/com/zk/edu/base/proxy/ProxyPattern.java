package com.zk.edu.base.proxy;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class ProxyPattern {

    public static void main(String[] args) {
        Subject p = new Proxy();
        p.request();
    }

}
