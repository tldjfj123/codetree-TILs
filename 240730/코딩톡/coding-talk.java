import java.util.*;

class Message {
    char sender;
    int n;

    public Message(char sender, int n) {
        this.sender = sender;
        this.n = n;
    }

    @Override
    public String toString() {
        return "Sender : " + sender + ", n : " + n;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //사람 수
        int m = sc.nextInt(); //메시지 수
        int p = sc.nextInt(); // p번째 이후 안 읽은 사람 찾기

        Message[] arr = new Message[m];

        for (int i = 0; i < m; i++) {
            char c = sc.next().charAt(0); // 보낸 사람
            int u = sc.nextInt(); // 안읽은사람 수
            
            arr[i] = new Message(c, u);   
        }
        boolean[] check = new boolean[n];
        // 이후 보낸사람 

        for (int i = p-1; i < m; i++) {
            int senderIdx = arr[i].sender - 'A';   
            check[senderIdx] = true;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                System.out.print((char)('A' + i) + " ");
            }
        }
    }
}