package com.zk.edu.base.Decorator;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class ConcreateComponent implements Component {


    public ConcreateComponent(){
        System.out.println("创建具体的组件");
    }

    @Override
    public void operation() {
        System.out.println("执行具体组件的方法");
    }
}
