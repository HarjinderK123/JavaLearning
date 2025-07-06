package ex_13_Functions;

import ex_08_If_Condition._name;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        // 1.Without Argument / Parameters and Without Return Type.
        withoutParam();
        //  2. Without Parameters but With Return Type
        String msg = withoutparamwithreturn();
        {
            System.out.println(msg);
        }
        //  3. With Parameters and Without Return Type ( 90%)
         withparamwithoutretrun("Harjinder",32,500000);
        withparamwithoutretrun("Harjinder K",33, 800000);


    //  4. With Parameters and With Return Type
         int msg2 = withparamwithreturn(3,5) ;
        {
            System.out.println("4th function");
            System.out.println(msg2);

            int msg3 = withparamwithretrun2(12, 34, 34);
            {
                System.out.println(msg3);

                int result = Math.max(3, 4);
            }
        }
    }




    // User Defined Functions.

    // 1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type


    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void withoutParam() {
        System.out.println(" -- Type 1 : Without Parameters Without Return Type -- ");
        System.out.println("Hi, How are you?");
    }

    //2. Without Parameters but With Return Type
    static String withoutparamwithreturn() {
        System.out.println(" -- Type 2 : Without Parameters but With Return Type -- ");
        System.out.println("wp_with_RT");
        return "how are you";
    }

    // //  3. With Parameters and Without Return Type ( 90%)
    static void withparamwithoutretrun(String name, int age, double salary) {
        System.out.println("Your name is ---> " + name+ "Your age is --->" + age + "Your salary is --->" + salary);
    }
    //  4. With Parameters and With Return Type
        static int withparamwithreturn(int a, int b){
            return a+b;
        }

        static int withparamwithretrun2( int a, int b, int c){
            return a+b+c;
        }

}
