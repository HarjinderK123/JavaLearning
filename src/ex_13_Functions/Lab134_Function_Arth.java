package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = 0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        } else{
            System.out.println("enter valid int only");
            return;
        }


        System.out.println("Enter the number 2");
        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        } else{
            System.out.println("enter valid int only");
            return;
        }

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_multi = multi(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_mod);
        System.out.println(result_multi);
        System.out.println(result_sub);




    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */

    static int sum(int a, int b){
        return a+b;
    }
    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    static  int sub(int a, int b){
        return a-b;
    }

    static  int multi(int a, int b){
        return a*b;
    }

    static  int mod(int a, int b){
        return a/b;
    }



}
