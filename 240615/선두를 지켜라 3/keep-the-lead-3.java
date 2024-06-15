import java.util.*;

class Order {
    int v;
    int t;

    public Order(int v, int t) {
        this.v = v;
        this.t = t;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Order[] orderA = new Order[N];
        Order[] orderB = new Order[M];

        int time = 0; // 전체 시간 구하기 (배열용)
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            time += t;
            orderA[i] = new Order(v, t);
        }

        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            orderB[i] = new Order(v, t);
        }

        int[] statusA = new int[time];
        int[] statusB = new int[time];

        int aIdx = 0;
        for (Order o : orderA) {
            for (int i = aIdx; i < aIdx + o.t; i++) {
                if (i == 0) {
                    statusA[i] = o.v;
                } else {
                    statusA[i] = statusA[i-1] + o.v;
                }   
            }
            aIdx += o.t;
        }

        int bIdx = 0;
        for (Order o : orderB) {
            for (int i = bIdx; i < bIdx + o.t; i++) {
                if (i == 0) {
                    statusB[i] = o.v;
                } else {
                    statusB[i] = statusB[i-1] + o.v;
                }   
            }
            bIdx += o.t;
        }

        // System.out.println(Arrays.toString(statusA));
        // System.out.println(Arrays.toString(statusB));

        int[] hof = new int[time];
        // 1 = A 우세, 2 = B 우세, 3 = 둘이 같음
        for (int i = 0; i < time; i++) {
            if (statusA[i] > statusB[i]) {
                hof[i] = 1;
            } else if (statusA[i] < statusB[i]) {
                hof[i] = 2;
            } else {
                hof[i] = 3;
            }
        }
        
        int res = 1;
        for (int i = 1; i < time; i++) {
            if (hof[i] != hof[i-1]) {
                res++;
            }
        }

        System.out.println(res);
    }
}