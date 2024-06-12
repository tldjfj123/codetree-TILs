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
            tmp.add(curr);
            if (order.equals("R")) {
                curr += value - 1;
            } else {
                curr -= value - 1;
            }
        }

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
        
        //배열 크기
        int size = max - min + 1;
        int offset = min * -1;

        int[] whiteArr = new int[size];
        int[] blackArr = new int[size];
        String[] colorArr = new String[size];

        for (Order o : orders) {
            if (o.order.equals("R")) {
                for (int i = offset; i < offset + o.value; i++) {
                    blackArr[i]++;
                    colorArr[i] = "B";
                }
                offset += (o.value - 1);
            } else {
                for (int i = offset; i > offset - o.value; i--) {
                    whiteArr[i]++;
                    colorArr[i] = "W";
                }
                offset -= (o.value - 1);

            }
        }
        
        int black = 0;
        int white = 0;
        int gray = 0;

        for (int i = 0; i < colorArr.length; i++) {
            if (whiteArr[i] >= 2 && blackArr[i] >= 2) {
                gray++;
            } else {
                if (colorArr[i].equals("B")) {
                    black++;
                } else {
                    white++;
                }
            }
        }

        System.out.print(white + " " + black + " " + gray);


        
    }
}