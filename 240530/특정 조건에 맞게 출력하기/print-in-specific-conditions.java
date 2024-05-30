import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr.add(n);
        }

        for (int i = 0; i < arr.size(); i++) {
            int v = arr.get(i);

            if (v % 2 == 0) {
                System.out.print(v / 2 + " ");
            } else {
                System.out.print(v + 3 + " ");
            }
        }
    }
}