import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            arr1.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            arr2.add(sc.nextInt());
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        if (arr1.equals(arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}