import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String std = sc.next();
        List<String> arr = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.indexOf(std) == 0) {
                arr.add(s);
            }
        }

        Collections.sort(arr);

        System.out.print(arr.get(k-1));
    }
}