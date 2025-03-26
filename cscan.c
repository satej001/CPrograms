//C-SCAN-Algo
#include<stdio.h>
#include<stdlib.h>
void main()
{
	int i, n, j, seek=0, max, head, move, q[100], temp;
	printf("Enter queue size ==> ");
	scanf("%d", &n);
	printf("Enter queue elements:-\n");
	for(i=0; i<n; i++)
	{
		scanf("%d" , &q[i]);
	}
	printf("Enter inital head postion ==> ");
	scanf("%d", &head);
	printf("Enter max disk size ==> ");
	scanf("%d", &max);
	printf("Enter head direction 1 for high and 0 for low ==> ");
	scanf("%d", &move);
	for(i=0; i<n; i++)
	{
		for(j=0; j<n-i-1; j++)
		{
			if(q[j] > q[j+1])
			{
				temp = q[j];
				q[j] = q[i+j];
				q[i+j] = temp;
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

	printf("Sequence of head movement:-\n");
	if(move == 1)
	{
		printf("%d\t", head);
		for(i=0; i<n; i++)
		{
			seek += abs(q[i] - head);
			head = q[i];
			printf("%d\t", q[i]);
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

		seek += abs(q[i+1] - 0);
		seek += abs(max - 1 - 0);
		head = max - 1;
		printf("%d\t", head);
		for(i=n-1; i>=index; i--)
		{
			seek += abs(q[i] - head);
			head = q[i];
			printf("%d\t", q[i]);
		}
	}
	printf("Total head movements ==> %d\n", seek);
}
