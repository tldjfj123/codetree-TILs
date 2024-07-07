import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();

        char[] arr = s.toCharArray();

        // 문자열 길이 1개부터 전체까지 돌리기  
        int res = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) { // 문자열 길이 설정
            List<String> tmp = new ArrayList<String>();
            boolean check = false;

            for (int j = 0; j <= N - i; j++) { // 시작점 
                String t = "";
                for (int k = j; k < j + i; k++) { //길이만큼 돌리기
                    t += arr[k];
                }
                if (!tmp.contains(t)) {
                    tmp.add(t);
                } else {
                    check = true;
                }
            }

            if (!check) {
                res = Math.min(res, tmp.get(0).length());
            }

        }

        System.out.println(res);
    }
}