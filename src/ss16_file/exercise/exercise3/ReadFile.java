package ss16_file.exercise.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String PATH_FILE = "D:\\c0523g1_dinhlong_module2\\src\\ss16_file\\exercise\\exercise3\\result.csv";

    public static List<Customer> readFile(String filePath) {
        List<Customer> customerList = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                int age = Integer.parseInt(temp[2]);
                String address = temp[3];
                customer = new Customer(id, name, age, address);
                if (customer.getAge() > 30 && customer.getAddress().equals("NewYork")) {
                    customerList.add(customer);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }

    public static void writeFile(List<Customer> customerList, String pathFile) {
        try (
                FileWriter fileWriter = new FileWriter(pathFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {

            for (int i = 0; i < customerList.size(); i++) {
                bufferedWriter.write(customerList.get(i).toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        List<Customer> customerList = readFile(PATH_FILE);
//        for (Customer customer: customerList) {
//            System.out.println(customer);
//        }
//        writeFile(readFile(PATH_FILE), "D:\\c0523g1_dinhlong_module2\\src\\ss16_file\\exercise\\exercise3\\targetFile");
        String str = "abc cb";
        String temp = str.toLowerCase().replace("/\\s/g","");
        boolean result = true;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != temp.charAt(temp.length()-1-i)){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
