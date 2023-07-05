package ss02_vonglap.exercise;



public class DisplayPrimeNumber {
    public static void main(String[] args) {

        int count = 0;
        int num = 2;

        while (count < 20) {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println("Number " + count + " = " + num);
            }
            num++;
        }
    }
}
