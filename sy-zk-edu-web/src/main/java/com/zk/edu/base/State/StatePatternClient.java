package com.zk.edu.base.State;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class StatePatternClient {

    public static void main(String[] args) {
        Context c = new Context();
        c.Handle();
        c.Handle();
        c.Handle();
        c.Handle();
    }
}
