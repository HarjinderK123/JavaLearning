package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("harjinder");
        System.out.println(builder.append(9000));

            builder.append(333);
        System.out.println(builder);
    }
}
