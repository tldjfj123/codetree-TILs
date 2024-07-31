import java.util.*;

class Talk {
    String sender;
    int unread;

    public Talk(String sender, int unread) {
        this.sender = sender;
        this.unread = unread;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 사람 수
        int m = sc.nextInt(); // 메시지 수
        int p = sc.nextInt(); // 확인이 필요한 메시지 번호

        Talk[] arr = new Talk[m];
        Map<String, Boolean> map = new TreeMap<String, Boolean>();

        for (int i = 0; i < m; i++) {
            String sender = sc.next();
            int unread = sc.nextInt();

            arr[i] = new Talk(sender, unread);
        }

        char c = 'A';
        for (int i = 0; i < n; i++) {
            map.put(String.valueOf((char)(c + i)), false);
        }

        // System.out.println(map);

        for (int i = m-1; i >= p-1; i--) {
            String s = arr[i].sender;
            int u = arr[i].unread;

            map.put(s, true);

            if (u == 0) {
                for (String key : map.keySet()) {
                    map.put(key, true);
                }
            }
        }

        // System.out.println(map);

        for (String key : map.keySet()) {
            if (!map.get(key)) {
                System.out.print(key + " ");
            }
        }

    }
}