#include <stdio.h>
int main()
{
    long long x1,x2,y1,y2,r1,r2;
    scanf("%lld%lld%lld%lld%lld%lld",&x1,&y1,&r1,&x2,&y2,&r2);
    if((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1)<(r1+r2)*(r1+r2)){
        printf("YES");
    }else{
        printf("NO");
    }
    return 0;
}