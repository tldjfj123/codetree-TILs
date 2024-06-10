import java.util.*;

class Score implements Comparable<Score>{
    String name;
    int kor;
    int eng;
    int math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Score score) {
        // 국어 점수를 내림차순으로 정렬
        if (this.kor != score.kor) {
            return score.kor - this.kor;
        }
        // 국어 점수가 같다면 영어 점수를 오름차순으로 정렬
        if (this.eng != score.eng) {
            return score.eng - this.eng;
        }
        // 국어 점수와 영어 점수가 같다면 수학 점수를 내림차순으로 정렬
        return score.math - this.math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Score[] arr = new Score[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            arr[i] = new Score(name, kor, eng, math);
        }

        Arrays.sort(arr);

        for (Score a : arr) {
            System.out.println(a.name + " " + a.kor + " " + a.eng + " " + a.math);
        }


    }
}