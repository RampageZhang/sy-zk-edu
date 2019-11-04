package com.zk.edu.base.Observer;

import com.zk.edu.base.proxy.*;

import static javafx.scene.input.KeyCode.O;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver(){
        String sys = "张昆下班啦";
        for(Observer observer : observerList){
            observer.response(sys);
        }
    }
}
