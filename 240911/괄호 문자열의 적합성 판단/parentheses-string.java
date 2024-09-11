import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for (char a : arr) {
            if (a == '(') {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("No");
                    return;
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(a);
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}