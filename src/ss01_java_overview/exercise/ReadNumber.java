package exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas import number you want read? ");
        String str = "";
        int numberInput = scanner.nextInt(); // Nhập số
        int hundred = numberInput / 100;    // Tìm hàng đơn trăm
        int residual = numberInput % 100;  // Tìm phần dư
        int dozens = residual / 10;       // Tìm hàng chục bằng cách lấy phần dư / 10
        int unit = residual % 10;          // Tìm hàng đơn vị
        if (numberInput < 1000 && numberInput >= 0) {
            if (hundred > 0) {
                switch (hundred) {
                    case 1:
                        str += "One hundred ";
                        break;
                    case 2:
                        str += " Two hundred ";
                        break;
                    case 3:
                        str += " Three hundred ";
                        break;
                    case 4:
                        str += " Four hundred ";
                        break;
                    case 5:
                        str += " Five hundred ";
                        break;
                    case 6:
                        str += "Six hundred ";
                        break;
                    case 7:
                        str += "Seven hundred ";
                        break;
                    case 8:
                        str += "Eight hundred ";
                        break;
                    case 9:
                        str += "Nine hundred ";
                        break;
                }
            }
            switch (dozens) {
                case 0:
                    break;
                case 1:
                    switch (unit) {
                        case 0:
                            str += "Ten";
                            break;
                        case 1:
                            str += "Eleven";
                            break;
                        case 2:
                            str += "Twelve";
                            break;
                        case 3:
                            str += "Thirteen";
                            break;
                        case 4:
                            str += "Fourteen";
                            break;
                        case 5:
                            str += "Fifteen";
                            break;
                        case 6:
                            str += "Sixteen";
                            break;
                        case 7:
                            str += "Seventeen";
                            break;
                        case 8:
                            str += "eighteen";
                            break;
                        case 9:
                            str += "nineteen";
                            break;
                    }
                    break;
                case 2:
                    str += "twenty";
                    break;
                case 3:
                    str += "thirty";
                    break;
                case 4:
                    str += "forty";
                    break;
                case 5:
                    str += "Fifty";
                    break;
                case 6:
                    str += "Sixty";
                    break;
                case 7:
                    str += "Seventy";
                    break;
                case 8:
                    str += "eighty";
                    break;
                case 9:
                    str += "ninety";
                    break;
            }

                switch (unit) {
                    case 0:
                        str += "";
                        break;
                    case 1:
                        str += "one";
                        break;
                    case 2:
                        str += "two";
                        break;
                    case 3:
                        str += "three";
                        break;
                    case 4:
                        str += "four";
                        break;
                    case 5:
                        str += "five";
                        break;
                    case 6:
                        str += "six";
                        break;
                    case 7:
                        str += "seven";
                        break;
                    case 8:
                        str += "eight";
                        break;
                    case 9:
                        str += "nine";
                        break;

            }
        } else {
            System.out.println("out of ability");
        }
        System.out.println(str);
    }
}
