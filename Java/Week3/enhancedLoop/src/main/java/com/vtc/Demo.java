package com.vtc;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {

    public static void main(String[] args) {
//        int[] array = {10,20,30,40,50};
//        System.out.printf("%13s\n", "Value only");
//        for (int number: array)
//            System.out.printf("%13d\n",number);

//        can not be changed
//        Collection<String> nameList = new ArrayList<String>();
//        nameList.add("Wayne");
//        nameList.add("Rayne");
//        nameList.add("Crayne");
//        for (String name : nameList){
//            name = "Luis";
//        }
//        System.out.println(nameList);

//        Use Enhanced loop for StringBuffer, we can change the elements

        Collection<StringBuffer> bufferList = new ArrayList<StringBuffer>();
        bufferList.add(new StringBuffer("Wayne"));
        bufferList.add(new StringBuffer("Rayne"));
        bufferList.add(new StringBuffer("Crayne"));

        for (StringBuffer name : bufferList){
            name.reverse();
        }
        System.out.println(bufferList);
    }
}
