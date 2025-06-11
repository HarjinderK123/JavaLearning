package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false;
        System.out.println(c);

        //1. **Logical Operators ->  (Digital Electronics)**
        //`&&`  (AND)
        // `||`  (OR)
        // `!`  (NOT)

        boolean c1 = true && false;
        System.out.println(c1);
    }
}
