package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course = 200;
        float GST = 19.5f;
        //int total4= course+GST; // Narrow - Implicit
        int total = course+(int)GST; // // Narrow - Explict
        System.out.println(total);

        float total3 = course+GST; // Widening - auto - implicit
        float total2= (float)course+GST; // Widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}
