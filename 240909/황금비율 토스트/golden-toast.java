import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //식빵 갯수
        int m = sc.nextInt(); //레시피 암호문 수
        String[] elements = sc.next().split("");
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(elements));

        // System.out.println(list);

        int index = list.size();
        for (int i = 0; i < m; i++) {
            String order = sc.next();
            
            if (order.equals("L")) {
                if (index > 0) {
                    index--;
                }
            } else if (order.equals("R")) {
                if (index < list.size()) {
                    index++;
                }
            } else if (order.equals("P")) {
                String v = sc.next();
                list.add(index, v);
                index++;
            } else { //D
                list.remove(index);
                index--;
            } 
        }

        for(String a : list) {
            System.out.print(a);
        }


    }
}