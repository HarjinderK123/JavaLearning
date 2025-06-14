package ex_06_Ternary_Operator;

public class Lab064_TO_P1 {
    public static void main(String[] args) {
        // The min number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
        int min = x<y? x:y;
        int max = x>y?x:y;
        System.out.println(min);
        System.out.println(max);
        System.out.println(Math.min(x,y));
        System.out.println(Math.max(x,y));
    }
}
