import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> arr = new ArrayList<Integer>();

        while (n != 0) {
            int v = n % b;
            arr.add(v);
            n = n / b;
        }

        for (int i = arr.size()-1; i > -1; i--) {
            System.out.print(arr.get(i));
        }
        
    }
}