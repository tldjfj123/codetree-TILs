import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());

            if (arr.size() % 2 == 1) {
                Collections.sort(arr);
                System.out.print(arr.get(arr.size() / 2) + " ");
            }
        }
    }
}