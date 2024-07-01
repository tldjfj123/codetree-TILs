import java.util.*;

class Cheese {
    int type;
    int time;

    public Cheese (int type, int time) {
        this.type = type;
        this.time = time;
    }

    @Override
    public String toString() {
        return type + " " + time; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수
        int M = sc.nextInt(); // 치즈 수
        int D = sc.nextInt(); // 치즈 먹은 기록 수
        int S = sc.nextInt(); // 아픈 기록 수

        Map<Integer, List<Cheese>> map = new HashMap<Integer, List<Cheese>>();

        for (int i = 0; i < D; i++) {
            int p = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();

            if (!map.containsKey(p)) {
                List<Cheese> tmp = new ArrayList<Cheese>();
                tmp.add(new Cheese(m, t));

                map.put(p, tmp);
            } else {
                List<Cheese> tmp = map.get(p);
                tmp.add(new Cheese(m, t));

                map.put(p, tmp);

            }
        }

        // System.out.println(map);

        Set<Integer> origin = new HashSet<Integer>();

        for (int i = 0; i < S; i++) {
            int person = sc.nextInt();
            int time = sc.nextInt();

            for (int key : map.keySet()) {
                List<Cheese> arr = map.get(key); // ?번이 먹은 종류랑 시간 담고있음

                for (Cheese c : arr) {
                    if (c.type == key && c.time < time) {
                        origin.add(c.type);
                    }
                }
                
            }
        }

        int res = 0;
        for (int o : origin) {
            int v = 0;
            for (int key : map.keySet()) {
                List<Cheese> tmpArr = map.get(key);

                for (Cheese c : tmpArr) {
                    if (c.type == o) {
                        v++;
                    }
                }
            }
            res = Math.max(v, res);
        }

        System.out.println(res);

    }
}