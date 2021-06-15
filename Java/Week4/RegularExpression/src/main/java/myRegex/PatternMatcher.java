package myRegex;

import java.util.regex.*;

public class PatternMatcher {

    public static void main(String[] args) {
        String regex = "\\Glog";
        String data = "hello";

//        1
        Pattern pattern = Pattern.compile("The regex!");
        Pattern patternDelimited = Pattern.compile("\\d");

//        2
        Pattern patternWithFlag = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Pattern compoundPattern = Pattern.compile("sample compound flag regex", Pattern.UNICODE_CASE | Pattern.COMMENTS);

//        3
        int flags = compoundPattern.flags();
        System.out.println( Pattern.UNICODE_CASE == (Pattern.UNICODE_CASE & flags));

        Matcher matcher = pattern.matcher("nap");

        boolean isMatch = Pattern.matches(regex,data);

        String output = String.format("" +
                        "found the text \"%s\" begining at " +
                        "index %d and ending at index %d.%n",
                matcher.group(),
                matcher.start(),
                matcher.end());
        System.out.println(output);

    }
}
