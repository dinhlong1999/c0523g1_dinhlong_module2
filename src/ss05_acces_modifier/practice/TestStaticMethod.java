package ss05_acces_modifier.practice;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Long");
        Student s2 = new Student(222, "Van");
        s1.display();
        s2.display();
    }

}
