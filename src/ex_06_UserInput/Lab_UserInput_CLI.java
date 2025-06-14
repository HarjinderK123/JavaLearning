package ex_06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
        String age_string = args[0];
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
        String canivote = age>=18? "yes":"No";
        System.out.println(canivote);
        //go to threedot and get input from user as CLI Argument
    }
}
