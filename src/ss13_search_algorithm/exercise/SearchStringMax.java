package ss13_search_algorithm.exercise;

import java.util.LinkedList;

import java.util.Scanner;

public class SearchStringMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> temp = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > temp.size()) {
                temp.clear();
                temp.addAll(list);
                list.clear();
            }
            list.clear();
        }
        for (Character character : temp) {
            System.out.print(character);
        }

    }
}

