//SCAN-Algo
#include<stdio.h>
#include<stdlib.h>
void main()
{
	int q[100], i, j, n, seek=0, max, head, move, temp;
	printf("Enter no. of request ==> ");
	scanf("%d", &n);
	printf("Enter the request sequence:-\n");
	for(i=0; i<n; i++)
	{
		scanf("%d", &q[i]);
	}
	printf("Enter initial head position ==> ");
	scanf("%d", &head);
	printf("Enter total disk space ==> ");
	scanf("%d", &max);
	printf("Enter head movement direction 1 high and 0 low ==> ");
	scanf("%d", &move);
	for(i=0; i<n; i++)
	{
		for(j=0; j<n-i-1; j++)
		{
			if(q[j] > q[j+1])
			{
				temp = q[j];
				q[j] = q[j+1];
				q[j+1] = temp;
			}
		}
	}

	int index;
	for(i=0; i<n; i++)
	{
		if(head < q[i])
		{
			index = i;
			break;
		}
	}

	printf("Sequence of head movement ==> ");
	if(move == 1)
	{
		printf("%d\t", head);
		for(i=index; i<n; i++)
		{
			seek += abs(q[i] - head);
			head = q[i];
			printf("%d\t", q[i]);
		}
		seek += abs(max - q[i-1] - 1);
		head = max - 1;
		printf("%d\t", head);
		for(i=index-1; i>=0; i--)
		{
			seek += abs(q[i] - head);
			head = q[i];
			printf("%d\t",  q[i]);
		}
	}

	else
	{
		printf("%d\t", head);
		for(i=index-1; i>=0; i--)
		{
			seek += abs(q[i] - head);
			head = q[i];
			printf("%d\t", q[i]);
		}
		seek += abs(q[i] - head);
		head = 0;
		printf("%d\t", head);
		for(i=index; i<n; i++)
		{
			seek += abs(q[i] - head);
			head = q[i];
			printf("%d\t", q[i]);
		}
	}

	printf("Total head movement %d\n", seek);
}
