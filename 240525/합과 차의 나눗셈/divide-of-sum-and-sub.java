import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int dif = a - b;

        double calc = sum / (double)dif;

        System.out.printf("%.2f", calc);
    }
}