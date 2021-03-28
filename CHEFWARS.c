#include <stdio.h>
#include <stdlib.h>

int i,j,t,n,k;

int main()
{

    int p[100000],h[100000];
    scanf("%d",&t);
    if(t>=1 && t<=100000)
    {
    for(i=0;i<t;i++)
        scanf("%d %d",(h+i),(p+i));

    for(i=0;i<t;i++)
    {
        if((*(h+i)>=1 && *(h+i)<1000000) && (*(p+i)>=1 && *(p+i)<1000000))
        {
        n=*(h+i);
        k=*(p+i);
        for(j=0;((n!=0 && n>0) && (k!=0 && k>0));j++)
        {
            n=n-k;
            //printf("%d \n",n);
            k=k/2;
            //printf("%d \n",k);
        }
        if(n<0 || n==0)
            printf("1 \n");
        else
            printf("0 \n");
    }
    else
        printf("Wrong Input");
    }
    return 0;
}
}
