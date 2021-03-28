#include <stdio.h> 
#include <stdlib.h>

int main() {
	// Read the number of test cases.
	int T, i, a=0, b=0;
	scanf("%d", &T);
	int *p = (int *)malloc(sizeof(int)* T);
	for(i=0;i<T;i++)
	{
	    int c = 0;
	    scanf("%d %d", &a, &b);
	    c=a+b;
	    *(p+i) = c;
	}
	for(i=0;i<T;i++)
	{
	    printf("%d \n",*(p+i));
	}
	return 0;
}