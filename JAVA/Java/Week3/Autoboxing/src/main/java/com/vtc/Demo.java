package com.vtc;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        Autoboxing Example
        List<Integer> listIntegers  = new ArrayList<>();
        for (int i = 1; i<10; i+=2)
            listIntegers.add(i);
//        Unnecessary boxing 'Integer.valueOf(i)'
//            listIntegers.add(Integer.valueOf(i));
//        System.out.println(listIntegers);
//        unboxing example
        int firstInteger = listIntegers.get(0);
        System.out.print("The first value is " + firstInteger);

    }
}
