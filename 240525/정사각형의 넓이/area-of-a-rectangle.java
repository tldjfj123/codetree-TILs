import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int width = n * n;

        System.out.println(width);
        if (n < 5) {
            System.out.println("tiny");
        }
    }
}