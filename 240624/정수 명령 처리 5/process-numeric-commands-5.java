import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<Integer> arr = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            String s = sc.next();

            if (s.equals("push_back")) {
                int v = sc.nextInt();
                arr.add(v);
            } else if (s.equals("get")) {
                int v = sc.nextInt();
                System.out.println(arr.get(v-1));
            } else if (s.equals("size")) {
                System.out.println(arr.size());
            } else {
                arr.pop();
            }
        }
    }
}