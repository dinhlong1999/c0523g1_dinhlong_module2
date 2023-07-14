package ss02_vonglap.exercise;


public class Print {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i < 6) {
                for (int j = 1; j <= 10; j++) {
                    if (i + j == 6 || j - i == 5) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 10; j++) {
                    if (i - j == 4 || i + j == 15) {
                        System.out.print(10 - i);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

