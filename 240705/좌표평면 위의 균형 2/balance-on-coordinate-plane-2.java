import java.util.*;

class Point {
    int x;
    int y; 

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return x + " " + y;
    }
}

public class Main {
    public static int calc(Point[] arr) {
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= 100; i++) { // x값
            for (int j = 1; j <= 100; j++) { // y값
                int cnt1 = 0;
                int cnt2 = 0;
                int cnt3 = 0;
                int cnt4 = 0;
                // 1사분면
                for (Point p : arr) {
                    if (p.x > i && p.y > j) {
                        cnt1++;
                    } else if (p.x < i && p.y > j) {
                        cnt2++;
                    } else if (p.x < i && p.y < j) {
                        cnt3++;
                    } else {
                        cnt4++;
                    }
                }

                int tmp = Math.max(cnt1, Math.max(cnt2, Math.max(cnt3, cnt4)));
                res = Math.min(tmp, res);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Point[] arr = new Point[N];

        for (int i = 0; i <N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[i] = new Point(x, y);
        }

        System.out.println(calc(arr));

        
    }
}