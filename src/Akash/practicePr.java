package Akash;

public class practicePr {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i==j){
                System.out.print(i*j+"\t");
            }else {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
        }
    }
}
