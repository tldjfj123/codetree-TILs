import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();

        
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n % 3 == 0) {
                break;
            }

            arr.add(n);
        }

        System.out.print(arr.get(arr.size()-1));


    }
}