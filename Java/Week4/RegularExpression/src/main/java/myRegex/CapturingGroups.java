package myRegex;

import java.util.regex.*;

public class CapturingGroups {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\w+).(\\w+)@(\\w+)\\.com");
        Matcher matcher = pattern.matcher("jack.smith@vtc.com"); //String to search

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
