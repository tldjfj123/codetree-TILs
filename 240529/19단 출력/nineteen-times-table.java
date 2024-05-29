public class Main {
    public static void main(String[] args) {
        int n = 19;
        int cnt = 0;

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
                cnt++;

                if (cnt % 2 == 0 || j == 19) {
                    System.out.println();
                    cnt = 0;
                } else {
                    System.out.print("/ ");
                }
            }
        }
        
    }
}