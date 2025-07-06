package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {

        int result = sum_of_number(3, 4);
        System.out.println(result);
        sum_of_number_no_retrun(3, 5);

    }

    static int sum_of_number(int a, int b) {
        return a + b;
    }

    static void sum_of_number_no_retrun(int a, int b) {
        System.out.println(a + b);

    }
}
