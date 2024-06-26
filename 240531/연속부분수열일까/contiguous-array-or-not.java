import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] a = new int[A];
        int[] b = new int[B];

        for (int i = 0; i < A; i++) {
            int input = sc.nextInt();
            a[i] = input;
        }

        for (int i = 0; i < B; i++) {
            int input = sc.nextInt();
            b[i] = input;
        }
        
        int n = A - B + 1;
        String res = "No";

        for (int i = 0; i < n; i++) {
            int idx = 0; // B배열용 idx
            boolean found = true;

            for (int j = i; j < i + B; j++) {
                if (a[j] != b[idx]) {
                    found = false;
                    break;
                }
                idx++;
            }

            if (found) {
                res = "Yes";
                break;
            }
        }

        System.out.print(res);
    }
}