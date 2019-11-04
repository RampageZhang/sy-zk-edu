package com.zk.edu.base.Singleton;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class HungrySingleton {


    private static final  HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return instance;
    }

}
