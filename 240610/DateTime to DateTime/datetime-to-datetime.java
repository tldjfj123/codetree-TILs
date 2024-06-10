import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int std = 1440 * 11 + 11 * 60 + 11;

        int sum = (1440 * a) + (60 * b) + c;

        if (sum - std < 0) {
            System.out.print(-1);
        } else {
            System.out.print(sum - std);
        }
        
    }
}