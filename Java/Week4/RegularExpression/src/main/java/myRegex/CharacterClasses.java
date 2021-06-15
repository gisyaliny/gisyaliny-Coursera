package myRegex;

import java.util.regex.*;

public class CharacterClasses {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[mon]ap"); // regex, literal string
//        Pattern pattern = Pattern.compile("[^n]ap"); // regex, literal string : not n
        Pattern pattern = Pattern.compile("(?i)[a-p6-9&&7-9]ap[^1-5]"); // regex, literal string : not n
        Matcher matcher = pattern.matcher("7ap95"); // String to search

        matcher.find();
        String output = String.format("" +
                        "found the text \"%s\" begining at " +
                        "index %d and ending at index %d.%n",
                matcher.group(),
                matcher.start(),
                matcher.end());
        System.out.println(output);
    }
}
