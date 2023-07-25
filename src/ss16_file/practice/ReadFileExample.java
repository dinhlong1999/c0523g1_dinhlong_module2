package ss16_file.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileExample(String path){
        File file = new File(path);
        try {
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum =0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Sum: " + sum);
            br.close();
        }catch (Exception e){
            System.out.println("Da xay ra loi ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap duong dan");
        String path = scanner.nextLine();

        ReadFileExample ex = new ReadFileExample();
        ex.readFileExample(path);
    }

}
