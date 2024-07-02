import java.util.*;

class Gift implements Comparable<Gift> {
    int price;
    int send;

    public Gift(int price, int send) {
        this.price = price;
        this.send = send;
    }
    
    @Override
    public String toString() {
        return price + " " + send;
    }

    @Override
    public int compareTo(Gift g) {
        return (this.price + this.send) - (g.price + g.send);
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        Gift[] arr = new Gift[N];

        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            int s = sc.nextInt();

            arr[i] = new Gift(p, s);
        }

        Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));

        int res = 0;
        for (int i = 0; i < N; i++) { // 할인 적용할 학생
            int cnt = 0;
            int budget = B;
            for (int j = 0; j < N; j++) {
                int calc = 0;
                if (i != j) {
                    calc = arr[j].price + arr[j].send;
                } else {
                    calc = arr[j].price / 2 + arr[j].send;
                }

                if (budget >= calc) {
                    budget -= calc;
                    cnt++;
                } 
            }
            res = Math.max(res, cnt);
        }

        System.out.println(res);
    }
}