package ex_14_String;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";

        String s4 = new String("Hello");
        String s5 = new String("hello");
        String s6 = new String("hello");


        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s3 == s5);
        System.out.println(s5 == s6);
        System.out.println( s6 == s1);
        System.out.println(s1 == s3);
        System.out.println(s1.concat("w"));


        // equals ( content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value


    }
}
