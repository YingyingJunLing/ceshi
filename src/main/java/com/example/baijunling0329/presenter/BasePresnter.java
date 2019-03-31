package com.example.baijunling0329.presenter;


public class BasePresnter<V> {
     private  V view;

    public void setView(V view) {
        this.view = view;
    }

    public V getView() {
        return view;
    }
    public void  detacher(){
        this.view=null;
    }
}
