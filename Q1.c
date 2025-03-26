//FCFS-Algo
#include<stdio.h>
#include<stdlib.h>

void main()
{
	int q[20], head, n, i, j, seek=0, max, diff;
	printf("Enter max range of disk ==> ");
	scanf("%d", &max);
	printf("Enter size of queue request ==> ");
	scanf("%d", &n);
	printf("Enter queue request :-\n");
	for(i=0; i<n; i++)
	{
		scanf("%d", &q[i]);
	}
	printf("Enter initial head position ==> ");
	scanf("%d", &head);
	q[0] = head;
	for(j=0; j<=n-1; j++)
	{
		diff = abs(q[j+1] - q[j]);
		seek += diff;
		printf("Head moves from %d to %d with seek %d.\n", q[j], q[j+1], diff);
	}
	printf("Total head movement is %d\n", seek);
}

