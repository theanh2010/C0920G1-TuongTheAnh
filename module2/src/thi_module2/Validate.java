package thi_module2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String NAME_REGEX ="^([A-Z][a-z]+\\s)+(|[A-Z][a-z]+)$";
    private static final String EMAIL_REGEX ="^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$";
    private static final String GENDER_REGEX = "^[mM][aA][lL][eE]|[fF][eE][mM][aA][lL][eE]|[uU][nN][kK][nN][oO][wW]$";
    private static final String ID_CARD = "^[0-9]{9}$";
    private static final String CMND_REGEX = "[0-9]{9}";
    private static final String PHONE_NUMBER = "^0([0-9]{9})$";
    private static Matcher matcher;
    private static Pattern pattern;
}
