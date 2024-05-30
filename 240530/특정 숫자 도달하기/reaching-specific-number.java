import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n >= 250) {
                break;
            }

            arr.add(n);
        }

        int sum = 0;
        for (int a : arr) {
            sum += a;
        }

        double avg = sum / (double)arr.size();

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);

    }
}