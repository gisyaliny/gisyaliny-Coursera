package myRegex;

import java.util.regex.*;

public class StringLiterals {
    public static void main(String[] args) throws Exception{

        Pattern pattern = Pattern.compile("(?i)vtc"); // regex, literal string
        Matcher matcher = pattern.matcher("asdasrfdwetgedgbdgredhgvtvVTC"); //String to search
//        find the next subsequence of the input sequence that matches the pattern
        boolean result = matcher.find();


//        System.out.println(matcher.group());
//        System.out.println(matcher.start());
//        System.out.println(matcher.end());

        String output = String.format("" +
                "found the text \"%s\" begining at " +
                "index %d and ending at index %d.%n",
                matcher.group(),
                matcher.start(),
                matcher.end());
        System.out.println(output);

    }

}
