package ss16_file.exercise.exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> readFile(String pathFile) {
        File file = new File(pathFile);
        List<String> list = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File no exists");
        } catch (IOException e) {
            System.out.println("No data");
        }
        return list;
    }

    public static void writeFile(List<String> str, String pathFile2) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < str.size(); i++) {
                bufferedWriter.write(str.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String url = "D:\\c0523g1_dinhlong_module2\\src\\ss16_file\\exercise\\exercise1\\result.csv";
        String result = "D:\\c0523g1_dinhlong_module2\\src\\ss16_file\\exercise\\exercise1\\targetfile";
        writeFile(readFile(url), result);
        System.out.println("Success");
    }
}
