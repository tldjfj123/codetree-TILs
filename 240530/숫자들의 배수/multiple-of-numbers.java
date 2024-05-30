import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int idx = 1;

        while (cnt != 2) {
            if ((n * idx) % 5 == 0) {
                cnt++;
            }
            System.out.print(n * idx + " ");
            idx++;
        }
    }
}