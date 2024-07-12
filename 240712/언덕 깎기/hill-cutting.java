import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minCost = Integer.MAX_VALUE;
        
        for (int start = 0; start <= 83; start++) {
            int end = start + 17;
            int cost = 0;
            
            for (int height : arr) {
                if (height < start) {
                    cost += (start - height) * (start - height);
                } else if (height > end) {
                    cost += (height - end) * (height - end);
                }
            }
            
            minCost = Math.min(minCost, cost);
        }
        
        System.out.println(minCost);
    }
}