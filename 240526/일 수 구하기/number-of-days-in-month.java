import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        Collections.addAll(arr, 1, 3, 5, 7, 8, 10, 12);

        if (n == 2) {
            System.out.println(28);
        } else {
            if (arr.contains(n)) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }

        }

    }
}