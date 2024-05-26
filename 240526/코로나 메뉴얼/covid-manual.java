import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            int temp = sc.nextInt();


            if (type.equals("Y") && temp >= 37) {
                cnt++;
            }

        }

        if (cnt >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}