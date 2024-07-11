import java.util.*;

/*
 a + b = 4
 b + c = 6
 c + d = 7
 d + e = 6

 a + 2(b + c + d) + e = 23
*/


public class Main {
    static int[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N-1];

        for (int i = 0; i < N-1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            check = new int[N+1];

            int idx = 0;
            int before = i;

            String s = "";
            s += String.valueOf(i);
            while (idx != N - 1) {
                int calc = arr[idx] - before;

                if (calc > 0 && check[calc] == 0) {
                    s += String.valueOf(calc);
                    check[calc] = idx+1;
                    before = calc;
                    idx++;
                } else {
                    break;
                }
            }
            

            if (s.length() == N) {
                char[] tmp = s.toCharArray();

                for (char c : tmp) {
                    System.out.print(c + " ");
                }
            }
        }

        

        
    }
}