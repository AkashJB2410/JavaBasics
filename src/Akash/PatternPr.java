package Akash;

public class PatternPr {
    public static void main(String[] args) {
        int count = 1 ;
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
