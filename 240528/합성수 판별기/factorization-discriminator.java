import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String check = "N";

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                check = "C";
                break;
            }
        }

        System.out.print(check);

        
    }
}