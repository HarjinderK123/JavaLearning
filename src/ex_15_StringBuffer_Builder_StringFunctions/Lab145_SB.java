package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer Stringbuffer = new StringBuffer("Harjinder");
        Stringbuffer.append(" Kaur");
        System.out.println(Stringbuffer);
        System.out.println(Stringbuffer.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
