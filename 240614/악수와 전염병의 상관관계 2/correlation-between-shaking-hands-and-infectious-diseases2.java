import java.util.*;

class Status {
    int count;
    boolean isInfected;

    public Status (int count, boolean isInfected) {
        this.count = count;
        this.isInfected = isInfected;
    }

    @Override
    public String toString() {
        return count + " " + isInfected;
    }
}

class Event implements Comparable<Event>{
    int t;
    int x;
    int y;

    public Event(int t, int x, int y) {
        this.t = t;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Event event) {
        return this.t - event.t;
    }

    @Override
    public String toString() {
        return t + " " + x + " " + y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt(); // 전염병 옮는 최댓값 (이후엔 안옮김)
        int P = sc.nextInt(); // 숙주
        int T = sc.nextInt(); // 악수 횟수

        Status[] arr = new Status[N];

        for (int i = 0; i < N; i++) {
            if (i != P-1) {
                arr[i] = new Status(0, false);
            } else {
                arr[i] = new Status(K, true);
            }
        }

        //시간별 정렬 위해 Event 배열 생성
        Event[] event = new Event[T];

        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            event[i] = new Event(t, x, y);
        }

        Arrays.sort(event);

        for (Event e : event) {
            int start = e.x;
            int end = e.y;

            //시작점 숙주 && 끝점 감염 안됐음 && 횟수 남아있을 때
            if (arr[start-1].isInfected && arr[start-1].count > 0 && !arr[end-1].isInfected) {
                arr[start-1].count--;
                arr[end-1].isInfected = true;
                arr[end-1].count = K;
            }
        }

        for (Status s : arr) {
            if (s.isInfected) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }




        
    }
}