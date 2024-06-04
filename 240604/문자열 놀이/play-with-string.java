import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            if (type == 1) {
                int idx1 = Integer.parseInt(a);
                int idx2 = Integer.parseInt(b);

                if (idx1 < idx2) {
                    s = s.substring(0, idx1-1) + s.charAt(idx2-1) + s.substring(idx1, idx2-1) + s.charAt(idx1-1) + s.substring(idx2, s.length());
                } else {
                    s = s.substring(0, idx2-1) + s.charAt(idx1-1) + s.substring(idx2, idx1-1) + s.charAt(idx2-1) + s.substring(idx1, s.length());
                }
                System.out.println(s);
            } else {
                char[] arr = s.toCharArray();

                for (int j = 0; j < arr.length; j++) {
                    if(arr[j] == a.charAt(0)) {
                        arr[j] = b.charAt(0);
                    }
                }

                s = new String(arr);
                System.out.println(s);
            }
        }
    }
}