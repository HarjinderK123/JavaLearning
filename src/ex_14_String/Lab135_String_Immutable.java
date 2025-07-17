package ex_14_String;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Harjinder";//SCP -- String constent pool
        //name.toUpperCase(); // uppar case will not happen because 1st name will call.
        name = name.toUpperCase(); // now it will work because we assigned the value.
        // reassign the value. string is immutable value.

        String s1 = "harjinder";
        String s2 = new String("Harjinder"); // QA -- Object area.
        System.out.println(name);
        System.out.println(s2);
    }
}
