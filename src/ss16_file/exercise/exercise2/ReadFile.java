package ss16_file.exercise.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILEPATH = "D:\\c0523g1_dinhlong_module2\\src\\ss16_file\\exercise\\exercise2\\countries.csv";

    public static List<Countries> readFile() {
        List<Countries> countries = new ArrayList<>();
        try (
                FileReader reader = new FileReader(FILEPATH);
                BufferedReader bufferedReader = new BufferedReader(reader);
        ) {
            String line;
            String[] temp;
            Countries countries1;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                countries1 = new Countries(id, code, name);
                countries.add(countries1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countries;
    }

    public static void main(String[] args) {
        List<Countries> countries = readFile();
        for (Countries countriesResult : countries) {
            System.out.println(countriesResult);

        }
    }
}


