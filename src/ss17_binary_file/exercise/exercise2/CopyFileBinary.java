package ss17_binary_file.exercise.exercise2;

import ss17_binary_file.practice.practice2.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileBinary {
    public static void writeFile(String path, List<Student1> student1){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                ) {
            objectOutputStream.writeObject(student1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student1> readFile(String path){
        List<Student1> student1List = new ArrayList<>();
        try(
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ) {
            student1List = (List<Student1>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student1List;
    }
    public  static void copyFile(String input,String output){
        readFile(input);
        writeFile(output,readFile(input));
    }
    private static final String SOURCE_FILE = "D:\\c0523g1_dinhlong_module2\\src\\ss17_binary_file\\exercise\\exercise2\\sourcefile.dat";
    private static final String TARGET_FILE = "D:\\c0523g1_dinhlong_module2\\src\\ss17_binary_file\\exercise\\exercise2\\targetfile.dat";
    public static void main(String[] args) {
        List<Student1> student1List = new ArrayList<>();
        student1List.add(new Student1(1,"Long", 80));
        student1List.add(new Student1(2,"Thien", 88));
        student1List.add(new Student1(3,"Hung", 90));
        writeFile(SOURCE_FILE,student1List);
        copyFile(SOURCE_FILE,TARGET_FILE);
    }

}
