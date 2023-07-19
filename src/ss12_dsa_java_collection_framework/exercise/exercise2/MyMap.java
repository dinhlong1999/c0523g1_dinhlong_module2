package ss12_dsa_java_collection_framework.exercise.exercise2;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string you want check");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> map1 : map.entrySet()) {
            System.out.println(map1.getKey() + " - " + map1.getValue());
        }


    }
}
