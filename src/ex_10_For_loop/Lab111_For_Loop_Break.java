package ex_10_For_loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        for(int i = 1; i <=30 ; i++ ){
            if(i==5){
                break;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
