package ex_09_switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {
        System.out.println("Enter the Day");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("tus");

            case 3:
                System.out.println("wed");

            default:
                System.out.println("invalid");


        }
    }
}
