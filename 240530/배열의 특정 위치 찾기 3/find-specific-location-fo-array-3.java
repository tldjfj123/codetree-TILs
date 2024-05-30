import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();


        while(true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr.add(n);

        }

        int sum = 0;

        for (int i = arr.size()-1; i > arr.size()-4; i--) {
            sum += arr.get(i);
        }

        System.out.print(sum);




    }
}