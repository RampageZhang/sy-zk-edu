package com.zk.edu.base.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangkun on 2019-11-02.
 */
public abstract  class Subject {


    protected List<Observer> observerList = new ArrayList<>();


    void addObserver(Observer observer){
        observerList.add(observer);
    }

    void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public abstract void notifyObserver();

}
