import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int count = 0;

        while (true) {
            int gap1 = Math.abs(a - b);
            int gap2 = Math.abs(b - c);

            // 거리가 모두 1이면 이미 연속한 수
            if (gap1 == 1 && gap2 == 1) {
                break;
            }

            // 하나라도 거리가 2이면 한 번의 연산만 더 수행해주면 완성
            if (gap1 == 2 || gap2 == 2) {
                count++;
                break;
            }

            // 각 둘씩 잡았을 때의 거리가 모두 2보다 크면
            // 거리가 가까운 쪽 안에 반대편 수를 넣어준다.
            if (gap1 > 2 && gap2 > 2) {
                if (gap1 < gap2) {
                    c = b;
                    b = a + 2;
                } else {
                    a = b;
                    b = c + 2;
                }
            } else if (b > 2) {
                a = b;
                b = b + 2;
            } else if (a > 2) {
                c = b;
                c = a + 2;
            }

            count++;
        }

        System.out.println(count);
    }
}