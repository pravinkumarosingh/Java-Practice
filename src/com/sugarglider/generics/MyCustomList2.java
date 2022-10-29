package com.sugarglider.generics;

import java.util.ArrayList;

public class MyCustomList2<T extends Number> {
    ArrayList<T> list = new ArrayList<T>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public String toString(){
        return list.toString();
    }
}
