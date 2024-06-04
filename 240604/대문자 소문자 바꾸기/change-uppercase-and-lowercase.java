import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char v = arr[i];

            if ('a' <= v && v <= 'z') {
                arr[i] = (char)(v-32);
            } else if ('A' <= v && v <= 'Z') {
                arr[i] = (char)(v+32);
            }
        }

        System.out.print(new String(arr));
    }
}