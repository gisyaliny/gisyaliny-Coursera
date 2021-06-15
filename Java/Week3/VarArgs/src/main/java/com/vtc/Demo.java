package com.vtc;

public class Demo {
    public static int methodNormal(int a,int b){
    return a+b;
    }
//    VarArgs Method
    public static int methodVarArgs(int...a){
        int total = 0;
        for (int j : a) {
            total += j;
        }
        System.out.println("total = " + total);
        return total;
    }

    public static void appendString(String...a){
        StringBuilder result = new StringBuilder();
        for(String j : a){
            result.append(j);
            result.append(" ");
        }
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        methodVarArgs(2,4,5,6,7);
        int result = methodNormal(2,3);
        System.out.println("result = " + result);
        appendString("Hi","How","Are","You");
    }


}
