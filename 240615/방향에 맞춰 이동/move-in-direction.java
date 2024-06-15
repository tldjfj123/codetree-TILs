import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // W E S N
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++) {
            String d  = sc.next();
            int v = sc.nextInt();

            if (d.equals("N")) {
                x += dx[3] * v;
                y += dy[3] * v;
            } else if (d.equals("E")) {
                x += dx[1] * v;
                y += dy[1] * v;
            } else if (d.equals("W")) {
                x += dx[0] * v;
                y += dy[0] * v;
            } else {
                x += dx[2] * v;
                y += dy[2] * v;
            }
        }

        System.out.println(x + " " + y);
    }
}