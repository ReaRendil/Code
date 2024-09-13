#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int price) {
    int answer = price;
    if(price>=500000) answer = answer*8/10;
        else if(price>=300000) answer = answer*9/10;
            else if(price>=100000) answer = answer*19/20;
    return answer;
}