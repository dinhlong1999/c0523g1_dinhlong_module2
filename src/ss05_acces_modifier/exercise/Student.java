package ss05_acces_modifier.exercise;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String display() {
        return "Name: " + name + ", " + "class: " + classes;
    }
}




