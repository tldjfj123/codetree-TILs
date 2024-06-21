import java.util.*;
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class Main {
    public static int calc(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        Point[] arr = new Point[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        int min = Integer.MAX_VALUE;
        for (int k = 0; k < n; k++) { // 금지
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (i == k || j == k) {
                        continue;
                    }

                    min = Math.min(calc(arr[i].x, arr[i].y, arr[j].x, arr[j].y), min);
                }
            }
        }
        System.out.println(min);


    }
}