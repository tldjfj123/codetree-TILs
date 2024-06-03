import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int v = sc.next().length();

            if (v > max) {
                max = v;
            }

            if (v < min) {
                min = v;
            }
        }

        System.out.print(max - min);
    }
}