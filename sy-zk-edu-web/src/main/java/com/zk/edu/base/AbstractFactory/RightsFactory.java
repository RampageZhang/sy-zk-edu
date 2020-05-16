package com.zk.edu.base.AbstractFactory;

/**
 * Created by zhangkun on 2019-12-11.
 */
public class RightsFactory {
    private  RightsFactory(){ };//private 避免类在外部被实例化
    public static  Rights getInstance(String flag){
        return RightsEnum.valueOf(flag).getRights();
    }

}
