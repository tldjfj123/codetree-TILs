import java.util.*;

public class Main {
    public static int[] makeTeam(boolean[] arr) {
        int[] res = new int[2];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                res[idx] = i;
                idx++;
            }
        }
        return res;
    }

    public static boolean check(boolean[] arr) {
        int count = 0;
        for (boolean a : arr) {
            if (a) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            char[] tmp = s.toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                arr[i][j] = tmp[j] - '0';
            }
        }

        Set<String> uniqueTeams = new HashSet<>();

        // 1. 가로 검사
        for (int i = 0; i < 3; i++) {
            boolean[] check = new boolean[10];
            for (int j = 0; j < 3; j++) {
                check[arr[i][j]] = true;
            }
            if (check(check)) {
                int[] team = makeTeam(check);
                Arrays.sort(team); // 팀 정렬
                uniqueTeams.add(Arrays.toString(team)); // Set에 추가
            }
        }

        // 2. 세로 검사
        for (int j = 0; j < 3; j++) {
            boolean[] check = new boolean[10];
            for (int i = 0; i < 3; i++) {
                check[arr[i][j]] = true;
            }
            if (check(check)) {
                int[] team = makeTeam(check);
                Arrays.sort(team); // 팀 정렬
                uniqueTeams.add(Arrays.toString(team)); // Set에 추가
            }
        }

        // 3. 대각선 검사 (좌측 상단에서 우측 하단)
        boolean[] check = new boolean[10];
        check[arr[0][0]] = true;
        check[arr[1][1]] = true;
        check[arr[2][2]] = true;
        if (check(check)) {
            int[] team = makeTeam(check);
            Arrays.sort(team); // 팀 정렬
            uniqueTeams.add(Arrays.toString(team)); // Set에 추가
        }

        // 4. 대각선 검사 (우측 상단에서 좌측 하단)
        check = new boolean[10];
        check[arr[2][0]] = true;
        check[arr[1][1]] = true;
        check[arr[0][2]] = true;
        if (check(check)) {
            int[] team = makeTeam(check);
            Arrays.sort(team); // 팀 정렬
            uniqueTeams.add(Arrays.toString(team)); // Set에 추가
        }

        // 고유 팀의 갯수 출력
        System.out.println(uniqueTeams.size());
    }
}