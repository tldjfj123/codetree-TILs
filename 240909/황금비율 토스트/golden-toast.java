import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 빵 수
        int m = sc.nextInt(); // 레시피 수

        String s = sc.next();
        String[] tmp = s.split("");
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(tmp));

        // System.out.println(list);

        ListIterator<String> it = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            String order = sc.next();

            if (order.equals("L")) {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (order.equals("R")) {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (order.equals("P")) {
                String v = sc.next();
                it.add(v);
            } else { //D
                it.next();
                it.remove();
            }
        }

        for (String l : list) {
            System.out.print(l);
        }
    }
}