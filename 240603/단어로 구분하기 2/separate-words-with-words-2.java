import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}