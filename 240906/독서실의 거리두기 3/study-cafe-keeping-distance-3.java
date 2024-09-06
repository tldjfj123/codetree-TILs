import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                indexes.add(i);
            }
        }

        int[] res = new int[indexes.size()];
        int idx = 0;
        for (int index : indexes) {
            res[idx] = index;
            idx++;
        }

        // System.out.println(Arrays.toString(res));

        int fin = 0;
        for (int i = 0; i < res.length-1; i++) {
            fin = Math.max(fin, (res[i+1] - res[i]) / 2);
            // System.out.println(fin);
        }

        int realFin = 1000;
        for (int i = 0; i < res.length-1; i++) {
            realFin = Math.min(realFin, res[i+1] - res[i]);
        }

        System.out.println(Math.min(realFin, fin));

        
    }
}