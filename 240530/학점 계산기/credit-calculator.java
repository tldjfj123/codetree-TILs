import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double score = sc.nextDouble();
            sum += score;
        }

        double avg = sum / n;

        System.out.printf("%.1f\n", avg);
        
        if (avg >= 4.0) {
            System.out.print("Perfect");
        } else if (avg >= 3.0) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }

    }
}