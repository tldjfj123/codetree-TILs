import java.util.*;

class Order {
    String order;
    int value;

    public Order(String order, int value) {
        this.order = order;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Order[] aOrders = new Order[N];
        Order[] bOrders = new Order[M];

        int size = 0;
        for (int i = 0; i < N; i++) {
            aOrders[i] = new Order(sc.next(), sc.nextInt());
            size += aOrders[i].value;
        }

        for (int i = 0; i < M; i++) {
            bOrders[i] = new Order(sc.next(), sc.nextInt());
        }

        int[] statusA = new int[size];
        int[] statusB = new int[size];

        int aIdx = 0;
        int aPos = 0;
        for (Order a : aOrders) {
            if (a.order.equals("R")) {
                for (int i = aIdx; i < aIdx + a.value; i++) {
                    statusA[i] = aPos;    
                    aPos++;
                }
            } else {
                for (int i = aIdx; i < aIdx + a.value; i++) {
                    statusA[i] = aPos;    
                    aPos--;
                }
            }
            aIdx += a.value;
                
        }

        int bIdx = 0;
        int bPos = 0;
        for (Order b : bOrders) {
            if (b.order.equals("R")) {
                for (int i = bIdx; i < bIdx + b.value; i++) {
                    statusB[i] = bPos;    
                    bPos++;
                }
            } else {
                for (int i = bIdx; i < bIdx + b.value; i++) {
                    statusB[i] = bPos;    
                    bPos--;
                }
            }
            bIdx += b.value;   
        }
        
        int res = -1;
        for (int i = 1; i < size; i++) {
            if (statusA[i] == statusB[i]) {
                res = i;
                break;
            }
        }

        System.out.println(res);




    }
}