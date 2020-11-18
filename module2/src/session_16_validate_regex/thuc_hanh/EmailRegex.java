package session_16_validate_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    private static Pattern pattern;
    private static String[] VALID_EMAIL = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};;
    private static String[] IN_VALID_EMAIL = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+";

    public  EmailRegex() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailRegex emailRegex = new EmailRegex();
        for (String email : VALID_EMAIL){
            boolean isValid = emailRegex.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        for (String email : IN_VALID_EMAIL) {
            boolean isValid = emailRegex.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
    }
}
