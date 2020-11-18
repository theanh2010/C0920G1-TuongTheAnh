package session_16_validate_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern ;
    private  static Matcher matcher;
    private  static final String PHONE_NUMBER_REGEX= "[(]84[)]-[(]0[1-9]{9}[)]";

    public static void main(String[] args) {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        System.out.println("(84)-(0978489648)".matches(String.valueOf(pattern)));
        System.out.println("(a8)-(22222222)".matches(String.valueOf(pattern)));
    }
}
