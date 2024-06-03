import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        for (int i = arr.length-1; i > -1; i--) {
            System.out.println(arr[i]);
        }
    }
}