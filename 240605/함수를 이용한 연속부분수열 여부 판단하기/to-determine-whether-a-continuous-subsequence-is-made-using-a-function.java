import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        String[] arr1 = new String[n1];
        String[] arr2 = new String[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }

        System.out.println(check(arr1, arr2));
    }

    static String check(String[] arr1, String[] arr2) {
        String str1 = String.join("", arr1);
        String str2 = String.join("", arr2);

        if (str1.contains(str2)) {
            return "Yes";
        }
        return "No";
    }
}