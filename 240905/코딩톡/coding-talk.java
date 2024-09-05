import java.util.*;
class Message {
    char sender;
    int unread;

    public Message(char sender, int unread) {
        this.sender = sender;
        this.unread = unread;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        int[] people = new int[n];
        Message[] arr = new Message[m];

        for (int i = 0; i < m; i++) {
            char sender = sc.next().charAt(0);
            int unread = sc.nextInt();
            arr[i] = new Message(sender, unread);
        }

        for (int i = p-1; i < m; i++) {
            int read = (int)arr[i].sender - 65;
            people[read] = 1;
            
        }

        for (int i = 0; i < p; i++) {
            if(arr[i].unread == 0) {
                for (int j = 0; j < n; j++) {
                    people[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (people[i] == 0) {
                System.out.print((char)(65 + i) + " ");
            }
        }


    }
}