#include <stdio.h>

int main() {
    int A,B,C;
    scanf("%d%d%d",&A,&B,&C);
    int sum = A*60+B+C;
    if(sum>=1440) sum-=1440;
    printf("%d %d",sum/60,sum%60);
    return 0;
}