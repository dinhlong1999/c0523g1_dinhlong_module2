package ss12_dsa_java_collection_framework.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Long", 20);
        hashMap.put("Van", 18);
        hashMap.put("Ronaldo", 34);
        System.out.println("Display entries in Hashmap");
        System.out.println(hashMap + " \n");
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Long", 20);
        linkedHashMap.put("Lewis", 18);
        linkedHashMap.put("Ronaldo", 40);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Long"));
    }
}
