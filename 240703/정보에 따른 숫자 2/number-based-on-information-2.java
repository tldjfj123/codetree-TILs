import java.util.*;

class Point implements Comparable<Point> {
    String s;
    int x;

    public Point (String s, int x) {
        this.s = s;
        this.x = x;
    }

    @Override
    public String toString() {
        return s + " " + String.valueOf(x);
    }

    @Override
    public int compareTo(Point p) {
        return this.x - p.x;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        Point[] arr = new Point[T];

        for (int i = 0; i < T; i++) {
            String s = sc.next();
            int x = sc.nextInt();
            arr[i] = new Point(s, x);
        }

        // System.out.println(min + " " + max);

        Arrays.sort(arr);
        
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            int dS = 999;
            int dN = 999;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].s.equals("S")) {
                    dS = Math.min(dS, Math.abs(i - arr[j].x));
                } else {
                    dN = Math.min(dN, Math.abs(i - arr[j].x));
                }
            }

            if (dS <= dN) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}