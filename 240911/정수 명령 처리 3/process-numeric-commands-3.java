import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<Integer>();

        for (int i = 0; i < n; i++) {
            String order = sc.next();

            if (order.equals("push_back")) {
                int v = sc.nextInt();
                deque.addLast(v);
            } else if (order.equals("push_front")) {
                int v = sc.nextInt();
                deque.addFirst(v);
            } else if (order.equals("pop_front")) {
                System.out.println(deque.pollFirst());
            } else if (order.equals("pop_back")) {
                System.out.println(deque.pollLast());
            } else if (order.equals("size")) {
                System.out.println(deque.size());
            } else if (order.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (order.equals("front")) {
                System.out.println(deque.peekFirst());
            } else {//back
                System.out.println(deque.peekLast());
            }
        }
    }
}