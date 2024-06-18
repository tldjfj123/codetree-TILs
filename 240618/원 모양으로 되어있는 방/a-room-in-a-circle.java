import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        // System.out.println(queue);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            int idx = 0;

            for (Integer q : queue) {
                tmp += idx * q;
                idx++;
            }

            // System.out.println(tmp);

            min = Math.min(tmp, min);

            int v = queue.poll();
            queue.add(v);

        }

        System.out.println(min);
    }
}