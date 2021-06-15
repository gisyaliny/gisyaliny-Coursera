package com.vtc;

public class AssertionUsage {
    public static void main(String[] args) {
//        Debugging without Assertions
        int a = 0;
        while (true){
            if (a > 1){
                System.out.println("Code correctly Excuting. Going to Break");
                break;
            }
            assert false: "Code Excution should not reach here, Something Wrong.";
//            System.out.println("Code Excution should not reach here, Something Wrong.");
            break;
        }

        int x = 3;
        assert (x>0) : "Asserting Internal Invariants, X";
    }

    public static void assertionExample(int a){
        assert a > 0 && a <=100;
        int b = a +2;
        assert b >a;
    }
}
