import java.util.*;

public class Main {
    static int[] arr;

    public static int calc(int x, int y) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        arrCopy[x] = 1;
        arrCopy[y] = 1;

        List<Integer> tmp = new ArrayList<Integer>();

        for (int i = 0; i < arrCopy.length; i++) {
            if (arrCopy[i] == 1) {
                tmp.add(i);
            }
        }

        int[] res = new int[tmp.size()];

        for (int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }

        // System.out.println(Arrays.toString(res));

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < res.length; i++) {
            int d = res[i] - res[i-1];
            min = Math.min(d, min);
        }
        
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        char[] sArr = s.toCharArray();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sArr[i] - '0';
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == 0 && arr[j] == 0) { // 빈자리 2개 골라서 착석시킴
                    res = Math.max(res, calc(i, j));
                }
            }
        }

        System.out.println(res);
    }
}