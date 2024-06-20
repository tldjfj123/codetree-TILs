import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] tmp = new int[101];
        int size = 0;
        
        // 위치와 알파벳 정보를 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            String s = sc.next();

            if (s.equals("G")) {
                tmp[v] = 1;
            } else if (s.equals("H")){
                tmp[v] = 2;
            }

            size = Math.max(size, v); // 최대 위치 갱신
        }

        // 필요한 부분만 복사
        int[] arr = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            arr[i] = tmp[i];
        }

        // 최대 길이에서 시작해 점차 줄여나가며 검사
        for (int length = size; length > 0; length--) { // 크기
            boolean flag = false;
            for (int start = 0; start <= size - length; start++) { // 시작점
                int end = start + length;

                if (arr[start] == 0 || arr[end] == 0) {
                    continue;
                }

                int cnt1 = 0; // G의 개수
                int cnt2 = 0; // H의 개수

                // 구간 내 G와 H 개수 세기
                for (int k = start; k <= start + length; k++) {
                    if (arr[k] == 1) {
                        // System.out.println("1 : " + k);
                        cnt1++;
                    } else if(arr[k] == 2) {
                        // System.out.println("2 : " + k);
                        cnt2++;
                    }    

                    // System.out.println(k + " : " + cnt1 + " " + cnt2);
                }

                // 조건에 맞는지 확인
                if ((cnt1 > 0 && cnt2 == 0) || (cnt2 > 0 && cnt1 == 0) || (cnt1 == cnt2)) {
                    // System.out.println(start + " " + cnt1 + " " + cnt2);
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(length);
                return;
            }
        }

        // 모든 구간을 확인한 후 조건을 만족하지 못할 경우
        System.out.println(0);
    }
}