package ex_12_DoWhile;

import javax.xml.transform.Source;
import java.util.Scanner;

public class CP_checkVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print char");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Its vowel");
        } else {
            System.out.println("consonants");
        }
    }

}
