#include <stdio.h>
int def (int a,int b){
    if(a>b){
        return a-b;
    }else{
        return b-a;
    }
}
int main()
{
    int a,b;
    scanf("%d%d",&a,&b);
    a--;b--;
    printf("%d",def(a%4,b%4) + def(a/4,b/4));
    return 0;
}