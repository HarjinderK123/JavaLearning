package ex_11_while;

public class Lab115_While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;

        }
        System.out.println("for loop same concpet no difference");
        int j = 0;
        for (; j < 10; j++) {
            System.out.println(j);
        }
    }
}
