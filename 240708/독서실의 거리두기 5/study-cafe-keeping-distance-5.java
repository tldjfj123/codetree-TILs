import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();

        char[] tmp = s.toCharArray();
        
        List<Integer> t = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int v = tmp[i] - '0';
            if (v == 1) {
                t.add(i);
            }
        }

        int[] arr = new int[t.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = t.get(i);
        }

        // System.out.println(Arrays.toString(arr));

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int left = arr[i];
            int right = arr[i+1];

            if ((left + right) % 2 == 0) {
                res = Math.max(res, (right - left) / 2);
            }
        }

        System.out.println(res);



    }
}