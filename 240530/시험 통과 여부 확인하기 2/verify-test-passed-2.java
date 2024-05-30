import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int[] arr = new int[4];
            

            for (int j = 0; j < 4; j++) {
                int score = sc.nextInt();

                arr[j] = score;
            }

            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }

            double avg = sum / (double)arr.length;

            if (avg >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.print(cnt);
    }
}