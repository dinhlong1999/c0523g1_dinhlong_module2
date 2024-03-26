package ss19_regex.exercise.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelValidate {
    private static final String REGEX = "^\\([84]{2}\\)-\\(0\\d{9}\\)$";
    private static final String[] VALID_TEL = {"(84)-(0932533481)", "(84)-(0905346958)"};
    private static final String[] INVALID_TEL = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    private Pattern pattern;
    private Matcher matcher;

    public TelValidate() {
        pattern = Pattern.compile(REGEX);
    }

    public boolean ValidTel(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        TelValidate telValidate = new TelValidate();
        for (String valid : VALID_TEL) {
            boolean isValid = telValidate.ValidTel(valid);
            System.out.println("PhoneNumber is " + valid + " is valid " + isValid);
        }

        for (String invalid : INVALID_TEL) {
            boolean isValid = telValidate.ValidTel(invalid);
            System.out.println("PhoneNumber is " + invalid + " is valid " + isValid);
        }
    }
}
