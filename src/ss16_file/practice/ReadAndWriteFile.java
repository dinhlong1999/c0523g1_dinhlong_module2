package ss16_file.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
   public List<Integer> readFile(String path){
       List<Integer> number = new ArrayList<>();
       try {
           File file = new File(path);
           if (!file.exists()){
               throw new FileNotFoundException();
           }
           BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
           String line ="";
           while ((line = bufferedReader.readLine()) != null){
               number.add(Integer.parseInt(line));
           }
           bufferedReader.close();

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       return number;
   }
   public void writeFile(String filePath, int max)  {
       try {
           FileWriter fileWriter = new FileWriter(filePath);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           bufferedWriter.write("Max value= "  + max);
           bufferedWriter.close();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
