#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int ads (int a, int b){
    if(a>b)return a-b;
        else return b-a;
}
int solution(int a, int b) {
    int answer = (a+b)*2;
    if(a%2==0&&b%2==0) answer = ads(a,b);
    else if(a%2==1&b%2==1) answer = a*a+b*b;
    return answer;
}