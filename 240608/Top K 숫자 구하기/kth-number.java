import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        System.out.print(arr.get(k-1));

    }
}