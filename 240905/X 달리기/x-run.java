import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        // 제곱근에 기반한 최대 증가 가능한 속도
        int maxSpeed = (int) Math.sqrt(X);

        int distance = 0;
        int speed = 0;
        int time = 0;

        // 속도를 증가시키면서 거리를 이동
        while (speed < maxSpeed) {
            speed++;
            distance += speed;
            time++;
        }

        // 남은 거리를 속도를 감소시키며 맞추기
        while (distance < X) {
            if (speed > 1) {
                speed--;
                distance += speed;
                time++;
            } else {
                // 속도가 1m/s일 때는 더 이상 감소할 수 없으므로, 한 번 더 추가
                distance++;
                time++;
            }
        }

        // 도착 시 속도가 1m/s인지 확인하고 조정
        if (distance > X) {
            // 마지막 거리 조정
            distance -= speed;
            speed--;
            time--;
        }

        System.out.println(time);
    }
}