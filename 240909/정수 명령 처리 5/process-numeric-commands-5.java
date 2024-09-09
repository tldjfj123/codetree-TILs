import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<Integer>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] order = br.readLine().split(" ");
            // System.out.println(Arrays.toString(order));
            if (order[0].equals("push_back")) {
                arr.add(Integer.parseInt(order[1]));
            } else if (order[0].equals("pop_back")) {
                if (!arr.isEmpty()) {
                    arr.remove(arr.size()-1);
                }
            } else if (order[0].equals("size")) {
                System.out.println(arr.size());
            } else { // get
                System.out.println(arr.get(Integer.parseInt(order[1])-1));
            }
        }
    }
}