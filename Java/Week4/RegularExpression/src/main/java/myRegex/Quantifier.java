package myRegex;

import java.util.regex.*;
import java.util.Scanner;

public class Quantifier {

    public static void main(String[] args) {
        
    }
    
    public String readLineRegex(){
        Scanner inputRegex = new Scanner(System.in);
        System.out.println("Enter the regex");
        return inputRegex.nextLine();
    }
    
    public void run(){
        while (true){
            Pattern pattern = Pattern.compile(readLineRegex());
            
        }

    }

}
