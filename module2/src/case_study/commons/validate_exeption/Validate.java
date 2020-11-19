package case_study.commons.validate_exeption;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static String note = "You entered incorrectly.Please re-enter";
    private static final String VILLA_REGEX = "SVVL-[0-9]{4}";
    private static final String HOUSE_REGEX = "SVHO-[0-9]{4}";
    private static final String ROOM_REGEX = "SVRO-[0-9]{4}";
    private static final String NAME_SERVICES ="[A-Z][a-z]+";
    private static final String ACCOMPANIED_SERVICES = "(massage)|(karaoke)|(food)|(drink)|(car rental)";
    private static final String RENTAL_TYPE = "[A-Z][a-z]+";
    private static final String STANDARD_ROOM = "[A-Z][a-z]+";
    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
    private static final String NAME_REGEX ="^([A-Z][a-z]+\\s)+(|[A-Z][a-z]+)$";
    private static Matcher matcher;
    private static Pattern pattern;
    public static boolean isIDVilla(String idVilla){
        pattern = Pattern.compile(VILLA_REGEX);
        matcher = pattern.matcher(idVilla);
        boolean isCheck = matcher.matches();
        if(!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isIDHouse(String idHouse){
        pattern = Pattern.compile(HOUSE_REGEX);
        matcher = pattern.matcher(idHouse);
        boolean isCheck = matcher.matches();
        if(!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isIDRoom (String idRoom){
        pattern =Pattern.compile(ROOM_REGEX);
        matcher = pattern.matcher(idRoom);
        boolean isCheck = matcher.matches();
        if (!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isNameServices ( String nameServices){
        pattern = Pattern.compile(NAME_SERVICES);
        matcher = pattern.matcher(nameServices);
        boolean isCheck = matcher.matches();
        if (!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isAccompaniedService(String accompaniedService){
        pattern = Pattern.compile(ACCOMPANIED_SERVICES);
        matcher = pattern.matcher(accompaniedService);
        boolean isCheck = matcher.matches();
        if (!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isRentalType (String rentalType){
        pattern = Pattern.compile(RENTAL_TYPE);
        matcher = pattern.matcher(rentalType);
        boolean isCheck = matcher.matches();
        if (!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isStandardRoom (String standardRoom){
        pattern = Pattern.compile(STANDARD_ROOM);
        matcher = pattern.matcher(standardRoom);
        boolean isCheck = matcher.matches();
        if(!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isBirthday (String birthday){
        pattern = Pattern.compile(BIRTHDAY_REGEX);
        matcher = pattern.matcher(birthday);
        boolean isCheck = matcher.matches();
        if (!isCheck){
            System.err.println(note);
        }
        return isCheck;
    }
    public static boolean isNameCustomer(String nameCustomer){
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(nameCustomer);
        return matcher.matches();
    }
}
