import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 80) {
            System.out.println("pass");
        } else {
            int gap = 80 - n;

            System.out.println(gap + " more score");
        }
    }
}