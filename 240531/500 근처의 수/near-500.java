import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int upMin = 1001;
        int downMax = 0;
        
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n > 500) {
                if (n < upMin) {
                    upMin = n;
                }
            } else {
                if (n > downMax) {
                    downMax = n;
                }    
            }
        }

        System.out.print(downMax + " " + upMin);

    }
}