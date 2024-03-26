package ss16_file.exercise.exercise3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<String,Integer> map = new TreeMap<>();
        list1.add("Gạo");
        list1.add("Áo");
        list1.add("Xe");
        list2.add(1);
        list2.add(2);
        list2.add(3);
        for (int i = 0; i < list1.size(); i++) {
            map.put(list1.get(i),list2.get(i));
        }
        List<String> temp1 = new ArrayList<>();
        temp1.add("Gạo");
        temp1.add("Áo");
        temp1.add("Xe");
        temp1.add("Áo");
        temp1.add("Gạo");
        List<Integer> temp2 = new ArrayList<>();
        temp2.add(1);
        temp2.add(3);
        temp2.add(2);
        temp2.add(2);
        temp2.add(3);
        int count = 0;
        for (int i = 0; i < temp1.size(); i++) {
            if (map.containsKey(temp1.get(i))){
                if (!Objects.equals(map.get(temp1.get(i)), temp2.get(i))){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
