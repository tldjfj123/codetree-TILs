import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            int temp = sc.nextInt();

            if (temp >= 37 && type.equals("Y")) {
                arr[0]++;
                cnt++;
            } else if (temp >= 37 && type.equals("N")) {
                arr[1]++;
            } else if (temp < 37 && type.equals("Y")) {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }

        if (cnt == 2) {
            System.out.print("E");
        }

        
    }
}