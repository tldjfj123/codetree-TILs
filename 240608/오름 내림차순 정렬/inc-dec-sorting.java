import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        for (Integer a : arr) {
            System.out.print(a + " ");
        }
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println();
        for (Integer a : arr) {
            System.out.print(a + " ");
        }

    }
}