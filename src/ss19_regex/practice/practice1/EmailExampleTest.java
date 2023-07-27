package ss19_regex.practice.practice1;

import ss19_regex.practice.practice1.EmailExample;

public class EmailExampleTest {
    private static EmailExample example;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email :invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
