#include <stdio.h>
#include <math.h>
int main()
{
	int T,i;
	float A,N;
	double sum;
	scanf("%d",&T);
	for(i=0;i<T;i++)
	{
		scanf("%f%f",&A,&N);
		sum = pow(A,N);
		sum = ((int)sum%9==0)? 9 : (int)sum%9;
		printf("%d\n", (int)sum);
	}
	return 0;
}