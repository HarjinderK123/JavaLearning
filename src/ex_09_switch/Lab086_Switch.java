package ex_09_switch;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {
        System.out.println("Enter the day");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            default:
                System.out.println("all invalid");
                break;
        }
    }
}
