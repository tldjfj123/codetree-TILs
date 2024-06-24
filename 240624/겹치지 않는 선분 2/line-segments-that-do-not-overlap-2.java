import java.util.*;

class Point {
    int x1;
    int x2;

    public Point(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            arr[i] = new Point(x1, x2);
        }

        int cnt = 0;
        boolean[] check = new boolean[N];
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i].x1;
            int end = arr[i].x2;
            // System.out.println("Start : " + start + " End : " + end);

            for (int j = i+1; j < arr.length; j++) {
                if ((start <= arr[j].x1 && arr[j].x2 <= end) || (arr[j].x1 <= start && end <= arr[j].x2)) {
                    // System.out.println("arr[j].x1 : " + arr[j].x1 + " arr[j].x2 : " + arr[j].x2);
                    check[i] = true;
                    check[j] = true;
                    break;
                }
            }
         }
        
        int res = 0;

        for (boolean c : check) {
            if(!c) {
                res++;
            }
        }

        System.out.println(res);
    }
}