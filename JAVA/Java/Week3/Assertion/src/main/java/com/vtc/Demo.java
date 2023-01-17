package com.vtc;

import java.util.ArrayList;

public class Demo {
    /**
     * @author yyang
     */

    public static void main(String[] args) {
//        assert booleanExpr.
//        assert booleanExpr : errorMessageExpr

//        List messages = new ArrayList();
//        String s = null;
//
//        assert messages.size() == 0 : "messages : should be empty.";
//        assert s != null: "String null";

        int x =1;
        assert x > 0;

        assert false : "Assertions are turn on";
    }
}
