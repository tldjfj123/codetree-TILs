import java.util.*;
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            Point no = arr[i];
            // System.out.println("깎두기 x: " + no.x + " 깍두기 Y : " + no.y);
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            for (int j = 0; j < N; j++) {
                if (j != i) {
                    minX = Math.min(arr[j].x, minX);
                    minY = Math.min(arr[j].y, minY);

                    maxX = Math.max(arr[j].x, maxX);
                    maxY = Math.max(arr[j].y, maxY);
                }
            } 

            int width = (maxX - minX) * (maxY - minY);

            res = Math.min(width, res);
            // System.out.println("maxX : " + maxX + " maxY : " + maxY);
            // System.out.println("minX : " + minX + " minY : " + minY);

        }

        System.out.println(res);

    }
}