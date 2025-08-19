package com.sugarglider.generics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        Container<String> stringContainer = new ContainerImpl<>();
        stringContainer.set("Java");
        System.out.println(stringContainer.get());

        Container<Integer> integerContainer = new ContainerImpl<>();
        integerContainer.set(1);
        System.out.println(integerContainer.get());

        Container<List<Integer>> listContainer = new ContainerImpl<>();
        listContainer.set(Arrays.asList(1,2,3));
        System.out.println(listContainer.get());

        GenericsDemo1<List> list1 = new GenericsDemo1<>();
        GenericsDemo2<ArrayList> list2 = new GenericsDemo2<>();
    }
}


interface Container<T>{
    void set(T a);
    T get();
}

class ContainerImpl<T> implements Container<T>{

    private T a;

    @Override
    public void set(T a) {
        this.a = a;
    }

    @Override
    public T get() {
        return a;
    }
}