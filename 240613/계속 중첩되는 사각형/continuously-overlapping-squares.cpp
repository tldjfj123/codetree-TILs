#include <iostream>
#define OFFSET 100 //x, y좌표의 최솟값이 -100
#define MAX_N 10
#define MAX_R 200

using namespace std;

int x1[MAX_N], x2[MAX_N], y1[MAX_N], y2[MAX_N];
int checked[MAX_R+1][MAX_R+1];
int n, cnt;

int main() {
    cin >> n;
    
    for(int i=0; i<n; i++){
        cin >> x1[i] >> y1[i] >> x2[i] >> y2[i];

        x1[i] += OFFSET;
        x2[i] += OFFSET;
        y1[i] += OFFSET;
        y2[i] += OFFSET;
    }

    for(int i=0; i<n; i++){
        for(int x=x1[i]; x<x2[i]; x++){
            for(int y=y1[i]; y<y2[i]; y++){
                if(i%2==0){
                    checked[x][y] = 1; //빨강
                }else{
                    checked[x][y] = 2; //파랑
                }
            }
        }
    }

    for(int i=0; i<=MAX_R; i++){
        for(int j=0; j<=MAX_R; j++){
            if(checked[i][j] == 2){ //파랑의 개수
                cnt++;
            }
        }
    }
    cout << cnt;
    return 0;
}