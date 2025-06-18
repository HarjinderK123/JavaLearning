package ex_08_If_Condition;

import javax.swing.*;
import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // int age = Integer.parseInt(args[0]);

        System.out.println("Enter The Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >=18){
            System.out.println("Able to do the vote");
        }
        else {
            System.out.println("Sorry ! not eligible for vote");
        }
    }
}
