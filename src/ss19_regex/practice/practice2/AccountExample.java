package ss19_regex.practice.practice2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String REGEX = "[_a-z0-9]{6,}$";

    public AccountExample(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static AccountExample accountExample;
    private static final String[] validAccount = new String[]{"123abc_","_abc123","_____","123456","abcdefgh"};
    private static final String[] inValidAccount = new String[]{".@","12345","1234_","abcde"};
    public static void main(String[] args) {
        accountExample= new AccountExample();
        for (String account: validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isValid);
        }

        for (String account: inValidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isValid);
        }
    }
}
