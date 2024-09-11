import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            String order = sc.next();

            if (order.equals("push")) {
                int v = sc.nextInt();
                queue.offer(v);
            } else if (order.equals("pop")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
            } else if (order.equals("size")) {
                System.out.println(queue.size());
            } else if (order.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else { // front
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek());
                }
            }
        }
    }
}