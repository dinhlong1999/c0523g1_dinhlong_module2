package ss02_vonglap.exercise;

public class DisplayPrimeNumberLess100 {
    public static void main(String[] args) {
        int num = 2;
        while (num < 100) {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num);
            }
            num++;
        }
    }
}
