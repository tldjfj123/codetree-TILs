import java.util.*;

/*
1. offset 해야하므로 배열의 전체 크기 구하기
2. 색깔 변화 체크할 배열 생성하기

3. for문 돌면서 시뮬레이션
*/

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

        int n = sc.nextInt();

        Order[] orders = new Order[n];

        //전체배열 크기를 구하기 위한 임시 배열
        List<Integer> tmp = new ArrayList<Integer>();

        int curr = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            String order = sc.next();

            orders[i] = new Order(value, order);

            if (order.equals("R")) {
                tmp.add(curr + value);
                curr += value;
            } else {
                tmp.add(curr - value);
                curr -= value;
            }
        }

        // offset 값 구하기 위해 배열크기 및 최대최소 구하기
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer t : tmp) {
            if (t < min) {
                min = t;
            }

            if (t > max) {
                max = t;
            }
        }

        int arrSize = max - min;
        int offset = min * -1;

        int[] simArr = new int[arrSize]; // 횟수 저장할곳
        String[] colorArr = new String[arrSize];

        int idx = offset;
        for (Order o : orders) {
            if (o.order.equals("R")) {
                for (int i = idx; i < idx + o.value; i++) {
                    simArr[i]++;
                    colorArr[i] = "B";
                }
                idx += o.value;
            } else {
                for (int i = idx-1; i >= idx - o.value; i--) {
                    simArr[i]++;
                    colorArr[i] = "W";
                }
                idx -= o.value;
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for (int i = 0; i < arrSize; i++) {
            if (simArr[i] >= 4) {
                gray++;
            } else {
                if (colorArr[i].equals("W")) {
                    white++;
                } else {
                    black++;
                }
            }
        }

        System.out.print(white + " " + black + " " + gray);


        
    }
}