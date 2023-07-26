package ss17_binary_file.practice.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_PATH = "D:\\c0523g1_dinhlong_module2\\src\\ss17_binary_file\\practice\\practice2\\text.dat";

    public static void writeDataFile(String path, List<Student> student) {
        try (
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFile(String path) {
        List<Student> list = new ArrayList<>();
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            list = (List<Student>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Long", "ĐN"));
        studentList.add(new Student(2, "Thiện", "QB"));
        studentList.add(new Student(3, "Hậu", "ĐN"));
        studentList.add(new Student(4, "Việt", "QN"));
        studentList.add(new Student(5, "Hưng", "QN"));
        writeDataFile(FILE_PATH, studentList);
        List<Student> studentList1 = readDataFile(FILE_PATH);
        for (Student student : studentList1) {
            System.out.println(student);
        }
    }

}
