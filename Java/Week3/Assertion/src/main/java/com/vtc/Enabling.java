package com.vtc;

public class Enabling {

    public static void main(String[] args) {
        try{
            System.out.println("testing assertions..");
            assert false: "If assertions are on, this will be printed";
        }catch (AssertionError e){
            e.printStackTrace();
        }
    }
}
