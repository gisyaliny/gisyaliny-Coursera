package myRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackReference {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b(\\w+) \\1\\b");
        Matcher matcher = pattern.matcher("vtc vtc"); //String to search

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
