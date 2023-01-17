public class ArraysDemo{

    public static void main(String[] args) {
        int[] c = new int[12]; // primitive type Array
        String[] b = new String[100]; //Reference type Arrary

        int[] myArray;
        myArray = new int[10];

        int[] arrary = {10,20,30,40,50};

        for(int counter = 0; counter < arrary.length; counter ++){
            System.out.printf("%5d%8d\n", counter, arrary[counter]);
        }

        // enhace for loop for arrary, only for get value but not for modifying
        System.out.printf("%5s%8s\n", "Position","Value");

        for(int number : arrary){
            System.out.printf("%13d\n", number);
        }

    }



}