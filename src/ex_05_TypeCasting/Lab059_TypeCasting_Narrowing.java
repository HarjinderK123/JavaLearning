package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int value = 390;
        //byte b = value; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte value2 = (byte)value;// Narrowing (int -> byte) - Explicit Casting is not allowed.
        System.out.println(value2);
    }
}
