import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    // Helper method to perform DFS and generate all combinations
    public static void choose(int K, int N) {
        int[] combination = new int[N];
        generateCombinations(K, N, 0, combination);
    }

    // Method to generate all combinations using DFS
    private static void generateCombinations(int K, int N, int depth, int[] combination) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(combination[i] + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = 1; i <= K; i++) {
            combination[depth] = i;
            generateCombinations(K, N, depth + 1, combination);
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int K = Integer.parseInt(st.nextToken()); // Maximum number K
        int N = Integer.parseInt(st.nextToken()); // Number of picks N
        
        choose(K, N);
    }
}