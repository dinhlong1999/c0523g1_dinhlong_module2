package ss19_regex.exercise.exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidate {
    private static final String REGEX = "^[CAK]?\\d{4}[GHIK]?$";
    private static final String[] VALIDATE_CLASS = {"C0223G", "A0323K"};
    private static final String[] INVALIDATE_CLASS = {"M0318G", "P0323A"};
    private static Pattern pattern;
    private Matcher matcher;

    public ClassValidate() {
        pattern = Pattern.compile(REGEX);
    }

    public boolean validClass(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassValidate classValidate = new ClassValidate();

        for (String string1 : VALIDATE_CLASS) {
            boolean isValid = classValidate.validClass(string1);
            System.out.println("Class is " + string1 + " is valid " + isValid);
        }
        for (String string2 : INVALIDATE_CLASS) {
            boolean isValid = classValidate.validClass(string2);
            System.out.println("Class is " + string2 + " is valid " + isValid);
        }
    }


}
