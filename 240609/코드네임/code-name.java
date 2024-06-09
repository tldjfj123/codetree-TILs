import java.util.*;

class Agent {
    String code = "";
    int score = 0;
    
    public Agent() {

    }

    public Agent(String code, int score) {
        this.code = code;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] arr = new Agent[5];

        for (int i = 0; i < 5; i++) {
            String code = sc.next();
            int score = sc.nextInt();

            arr[i] = new Agent(code, score);
        }

        String resCode = "";
        int resScore = Integer.MAX_VALUE;

        for (Agent a : arr) {
            if (a.score < resScore) {
                resScore = a.score;
                resCode = a.code;
            }
        }

        System.out.println(resCode + " " + resScore);

        
    }


}