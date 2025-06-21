package ex_09_switch;

import java.util.Scanner;

public class Lab084_switch {
    public static void main(String[] args) {
        System.out.println("Enter the Day");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tus");
                break;
            case 3:
                System.out.println("wed");
                break;
            default:
                System.out.println("invalid");
                break;



        }
    }
}
