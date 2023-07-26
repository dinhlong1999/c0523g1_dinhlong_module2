package ss17_binary_file.exercise.exercise1.util;

import ss17_binary_file.exercise.exercise1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAnhWrite {
    public static List<String> readFie(String filePath) {
        List<String> stringList = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    public static void writeFile(String filePath, List<String> stringList, boolean append) {
        try (
                FileWriter fileWriter = new FileWriter(filePath,append);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
