import java.util.*;

public class Main {
    public static int[] calc(int a, int b, int c, int d) {
        int[] res = new int[15];

        res[0] = a;
        res[1] = b;
        res[2] = c;
        res[3] = d;
        res[4] = a + b;
        res[5] = b + c;
        res[6] = c + d;
        res[7] = d + a;
        res[8] = a + c;
        res[9] = b + d;
        res[10] = a + b + c;
        res[11] = a + b + d;
        res[12] = a + c + d;
        res[13] = b + c + d;
        res[14] = a + b + c + d;

        Arrays.sort(res);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];

        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 1; i <= 40; i++) {
            for (int j = i; j <= 40; j++) {
                for(int k = j; k <= 40; k++) {
                    for (int l = k; l <= 40; l++) {
                        if (Arrays.equals(calc(i, j, k, l), arr)) {
                            System.out.println(i + " " + j + " " + k + " " + l);
                            return;
                        }
                    }
                }
            }
        }
        
    }
}