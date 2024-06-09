import java.util.*;

class Order {
    String code;
    String color;
    int second;

    public Order(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Order order = new Order(code, color, second);

        System.out.println("code : " + order.code);
        System.out.println("color : " + order.color);
        System.out.println("second : " + order.second);
    }
}