package com.zk.edu.base.State;

/**
 * Created by zhangkun on 2019-11-04.
 */
public class Context {

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    State state;

    public Context(){
        state = new ConcreteStateA();
    }

    public void Handle(){

        state.Handler(this);
    }















}
