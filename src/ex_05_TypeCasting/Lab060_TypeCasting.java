package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main (String[] args){
        long number = 989898989890909090l;
        //short s1 = phone; // Implicit narrow ??
        short s1 = (short) number;  //Explicit Narrow??
        System.out.println(number);
    }

}
