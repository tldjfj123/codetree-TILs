import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String order = sc.next();
        int b = sc.nextInt();

        System.out.print(calc(a, order, b));
    }

    static String calc(int a, String order, int b) {
        if (order.equals("+")) {
            return a + " + " + b + " = " + (a + b);
        } else if (order.equals("-")) {
            return a + " - " + b + " = " + (a - b);
        } else if (order.equals("*")) {
            return a + " * " + b + " = " + (a * b);
        } else if (order.equals("/")) {
            return a + " / " + b + " = " + (a / b);
        } else {
            return "False";
        }
    }
}