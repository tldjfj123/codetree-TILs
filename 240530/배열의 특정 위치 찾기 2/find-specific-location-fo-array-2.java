import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (i % 2 == 1) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }

        System.out.print(Math.abs(evenSum - oddSum));
    }
}