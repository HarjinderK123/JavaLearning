package ex_07_Increment_Decrement_Op;

public class Lab073_ID {
    public static void main(String[] args) {
        int a = 10;
         int b = a++;
        System.out.println(a);
        System.out.println(b);

        // line n | a | exp ERT table
        //  5 |10| NA
        // 6 | 11 | 10
        // 7 | 11 |Na
        // 8 |na |10
    }
}
