import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            String order = arr[0];

            if (order.equals("push_front")) {
                int v = Integer.parseInt(arr[1]);
                linkedList.addFirst(v);
            } else if (order.equals("push_back")) {
                int v = Integer.parseInt(arr[1]);
                linkedList.addLast(v);
            } else if (order.equals("pop_front")) {
                System.out.println(linkedList.removeFirst());
            } else if (order.equals("pop_back")) {
                System.out.println(linkedList.removeLast());
            } else if (order.equals("size")) {
                System.out.println(linkedList.size());
            } else if (order.equals("empty")) {
                if (linkedList.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (order.equals("front")) {
                System.out.println(linkedList.getFirst());
            } else { //back
                System.out.println(linkedList.getLast());
            }
        }
    }
}