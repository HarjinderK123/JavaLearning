package ex_09_switch;

public class Lab089_Interview {
    public static void main(String[] args) {
        char A = 'A';
        switch (A){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("invalid");
                //       switch (true){ in switch boolen not working
        }
    }
}
