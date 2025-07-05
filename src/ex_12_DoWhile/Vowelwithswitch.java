package ex_12_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Vowelwithswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print value");
        char ch = scanner.next().toLowerCase(Locale.ROOT).charAt(0);
        switch (ch){
            case 'a', 'e', 'i', 'o','u':
                System.out.println("its vowal");
            default:
                System.out.println("cons");
        }
    }
}
