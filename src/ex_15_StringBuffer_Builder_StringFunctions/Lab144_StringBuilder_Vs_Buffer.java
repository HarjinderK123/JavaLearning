package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s1 = "Harjinder";
        String s2 = new String ("Harjinder2");

        StringBuffer s3 =  new StringBuffer("Harjinder 3");
        StringBuilder s4 = new StringBuilder("Harjinder 4");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
