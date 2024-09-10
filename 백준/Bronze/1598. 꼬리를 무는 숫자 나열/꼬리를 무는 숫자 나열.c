
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
    int A = a%4; int B = b%4;
    if(A%4==0)A=4;
    if(b%4==0)B=4;
    int sum = def(A,B);
    for(;;) {
         if(a%4==0) break;
         a++;
}
    for(;;){
              if(b%4==0) break;
        b++;
    }
    sum+= def(a/4,b/4);
    
    printf("%d",sum);
    return 0;
}