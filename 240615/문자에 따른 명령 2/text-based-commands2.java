import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1}; // N E S W
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 0;
        char[] arr = sc.next().toCharArray();

        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'L') {
                idx--;
                if (idx < 0) {
                    idx = 3;
                }
            } else if (arr[i] == 'R') {
                idx++;
                if (idx > 3) {
                    idx = 0;
                }
            } else {
                x += dx[idx];
                y += dy[idx];
            }
        }

        System.out.println(x + " " + y);

        
    }
}