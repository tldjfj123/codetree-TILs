import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < n; i++) {
            String order = sc.next();

            if (order.equals("push")) {
                int v = sc.nextInt();
                stack.push(v);
            } else if (order.equals("pop")) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }
            } else if (order.equals("size")) {
                System.out.println(stack.size());
            } else if (order.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else { // top
                System.out.println(stack.peek());
            }
        }
    }
}