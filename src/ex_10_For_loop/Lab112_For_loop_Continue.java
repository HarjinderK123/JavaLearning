package ex_10_For_loop;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i == 10) {
                continue;

            }
            System.out.println(i);
        }
    }
}
