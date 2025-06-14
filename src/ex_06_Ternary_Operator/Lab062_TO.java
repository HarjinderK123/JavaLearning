package ex_06_Ternary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        //Age to vote?
        int age = 18;
        String canIVote = age<19 ? "yes": "No";
        System.out.println(canIVote);
    }
}
