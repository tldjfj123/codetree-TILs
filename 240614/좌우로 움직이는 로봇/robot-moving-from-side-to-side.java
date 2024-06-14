import java.util.*;

class Order {
    int value;
    String order;

    public Order(int value, String order) {
        this.value = value;
        this.order = order;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Order[] aOrders = new Order[N];
        Order[] bOrders = new Order[M];


        int aTmp = 0;
        for (int i = 0; i < N; i++) {
            aOrders[i] = new Order(sc.nextInt(), sc.next());
            aTmp += aOrders[i].value;
        }

        int bTmp = 0;
        for (int i = 0; i < M; i++) {
            bOrders[i] = new Order(sc.nextInt(), sc.next());
            bTmp += bOrders[i].value;
        }

        // System.out.println(aTmp + " " + bTmp);

        int size = Math.max(aTmp, bTmp); // 배열 선언용

        int[] statusA = new int[size];
        int[] statusB = new int[size];

        int aIdx = 0;
        int aCurr = 0;
        //simulate
        for (Order a : aOrders) {
            String order = a.order;
            int value = a.value;

            if (order.equals("L")) {
                for (int i = aIdx; i < aIdx + value; i++) {
                    aCurr--;
                    statusA[i] = aCurr;
                }
            } else {
                for (int i = aIdx; i < aIdx + value; i++) {
                    aCurr++;
                    statusA[i] = aCurr;
                }
            }
            aIdx += value;
        }

        int bIdx = 0;
        int bCurr = 0;
        for (Order b : bOrders) {
            String order = b.order;
            int value = b.value;

            if (order.equals("L")) {
                for (int i = bIdx; i < bIdx + value; i++) {
                    bCurr--;
                    statusB[i] = bCurr;
                }
            } else {
                for (int i = bIdx; i < bIdx + value; i++) {
                    bCurr++;
                    statusB[i] = bCurr;
                }
            }
            bIdx += value;        
        }

        if (aIdx < bIdx) {
            for (int i = aIdx; i < bIdx; i++) {
                statusA[i] = statusA[i-1];
            }
        } else if (aIdx > bIdx) {
            for (int i = bIdx; i < aIdx; i++) {
                statusB[i] = statusB[i-1];
            }
        }
        
        // System.out.println(Arrays.toString(statusA));
        // System.out.println(Arrays.toString(statusB));

        int cnt = 0;
        for (int i = 0; i < size; i++) {
            if (statusA[i] == statusB[i]) {
                if (i == 0) {
                    cnt++;
                } else {
                    if (statusA[i-1] != statusB[i-1]) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    
    }
}