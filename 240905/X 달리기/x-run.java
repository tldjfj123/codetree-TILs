import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        //속도를 올렸을때, 남은거리가 (속도) + (속도-1) + ... + 1보다 크다면 올려도 된다,
        //속도를 유지했을때, 남은거리가 (속도) + (속도-1) + ... + 1보다 크다면 유지해도 된다,
        //위 두 상황이 아니라면 속도를 감소해야한다.

        //초깃값
        int distance = 1;
        int speed = 1;
        int time = 1;

        int ret = 0;
        while(true){
            if(getDescSum(speed+1) <= x-distance){ //속도를 올려도 남은거리를 정확하게 완주할 수 있다면, 속도를 올린다
                speed++;
            }else if(getDescSum(speed) <= x-distance){ //속도를 유지해서 남은거리를 정확하게 완주할 수 있다면, 속도를 유지한다
                //do nothing
            }else{ //속도를 줄여야만 남은거리를 정확하게 완주할 수 있으므로, 속도를 줄인다.
                speed--;
            }
            time++;
            distance += speed;

            if(distance == x){
                ret = time;
                break;
            }
        }
        System.out.print(ret);
    }

    static int getDescSum(int num){
        if(num == 1){
            return num;
        }else{
            return num + getDescSum(num-1);
        }
    }
}