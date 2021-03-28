#include <stdio.h>
#include <stdlib.h>

int main(){
    
    float withdraw, balance;
    scanf("%f %f", &withdraw, &balance);
    
    if( (int)(withdraw)%5==0 && withdraw + 0.5 <=balance ){
        printf("%.2f", balance - withdraw - 0.5);
    }
    else{
        printf("%.2f", balance*1.0);
    }
    return 0;
}