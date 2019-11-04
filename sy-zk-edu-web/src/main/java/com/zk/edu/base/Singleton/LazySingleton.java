package com.zk.edu.base.Singleton;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class LazySingleton {

    private static volatile LazySingleton  instance = null;  //保证 instance 在所有线程中同步

    private  LazySingleton(){ };//private 避免类在外部被实例化

    public static  synchronized  LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }


}
