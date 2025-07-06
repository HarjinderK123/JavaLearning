package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
      pramod_f1();
     return_boolean();
     return_float_pi_value();
    }
        static void pramod_f1 () {
            System.out.println("No Return");
        }

        static int return_int () {
            System.out.println("This is a normal function which return something.");
            System.out.println("This is a normal function which return something.");
            System.out.println("This is a normal function which return something.");
            return 10;
        }

        static boolean return_boolean () {
            System.out.println("ww");
            return true;
        }
        static float return_float_pi_value () {
            System.out.println("www");
            return 3.14f;
        }

        static long return_long () {
            return 10l;
        }

        static String return_String () {
            return "Pramod";
        }
    }
