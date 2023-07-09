package ss05_acces_modifier.exercise;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("long");
        s1.setClasses("C05");
        System.out.println(s1.display());
    }
}
