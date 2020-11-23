package task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public final String NAME = "[A-Z]+[a-z]+";
    public final String NAME_1 = "\\d+";
    public final String INT = "^[0-9]+$";
    public final String DOUBLE = "^[0-9]+.[0-9]+$";
    public Pattern pattern;
    public Matcher matcher;
    public boolean isInt(String string){
        pattern = Pattern.compile(INT);
        matcher = pattern.matcher(string);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("Input fail : " + string + ", Input " + INT);
        }
        return flag;
    }
    public boolean isDouble(String string){
        pattern = Pattern.compile(DOUBLE);
        matcher = pattern.matcher(string);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("Input fail : " + string + ", Input " + DOUBLE);
        }
        return flag;
    }
    public boolean isName(String string){
        pattern = Pattern.compile(NAME);
        matcher = pattern.matcher(string);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("Input fail : " + string + ", Input " + NAME);
        }
        return flag;
    }
    public boolean isName1(String string){
        pattern = Pattern.compile(NAME_1);
        matcher = pattern.matcher(string);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("Input fail : " + string + ", Input " + NAME_1);
        }
        return flag;
    }
}
