package com.zk.edu.base.Observer;

/**
 * Created by zhangkun on 2019-11-02.
 */
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addObserver(new ObserverA());
        subject.addObserver(new ObserverB());
        subject.notifyObserver();
    }
}
