package ex_06_Ternary_Operator;

public class Lab067_Real_Age_Classification {
    public static void main(String[] args) {
        int age = 5;
        String result = (age <18)? "Minior" :  (age <60)? "Adult":"Senior" ;
        System.out.println(result);
        //int j = age++;// + ++age;
        //System.out.println("J = "+ j + " age = "+ age);
    }
}
