import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char target = sc.next().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.print(i);
                break;
            }
        }


    }
}