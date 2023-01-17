import java.util.Arrays;

public class SearchingSorting {
    public static void main(String[] args) {
        String fruits[] = new String[] {"apple","pear","peach","Banana","Kiwi"};
        Arrays.sort(fruits);
        for(String temp:fruits){
            System.out.println("fruits" + " : " + temp);
        }

        String[] numbers = new String[] {"7","5","4","2","6","3","1"};
        Arrays.sort(numbers,1,6);
        System.out.println("*** Selective Sort Array ***");
        for (String str : numbers){
            System.out.println(str);
        }

        int seachValue = Arrays.binarySearch(numbers,"4");
        System.out.println("The index of the element 4 is : "+seachValue);

    }
}
