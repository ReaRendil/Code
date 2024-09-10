
#include <stdio.h>
int def(int n,int m){
    if(n<=m){
        return n;
    }else{
        return m;
    }
}
int main()
{
    int N,a,b,c;
    scanf("%d%d%d%d",&N,&a,&b,&c);
    printf("%d",def(N,a)+def(N,b)+def(N,c));
    return 0;
}