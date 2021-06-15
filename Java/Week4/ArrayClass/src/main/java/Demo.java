import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int [] anArray = {2,4,6};
        System.out.println(Arrays.toString(anArray));
        System.out.println(anArray);

        String fruits[] = new String[] {"apple","pear","peach"};

        List fruitsList = Arrays.asList(fruits);

        if (fruitsList.contains("apple")){
            System.out.println("Yes Contains Apple!");
        }

        String[] copyTo = Arrays.copyOfRange(fruits,0,2);
        System.out.println(Arrays.toString(copyTo));

        int[] array = new int[3];
        Arrays.fill(array,10);
        for(int i : array) {
            System.out.println(i);

    }
}}
