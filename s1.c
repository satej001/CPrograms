#include<stdio.h>
#define r 10
#define c 10
int alloc[r][c], avail[r], need[r][c], max[r][c], i, n, j, m;

void AcceptAllocations()
{
	printf("Enter matrix for allocation:-\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<m; j++)
		{
			scanf("%d", &alloc[i][j]);
		}
	}
}

void AcceptMax()
{
	printf("Enter matrix for maximum:-\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<m; j++)
		{
			scanf("%d", &max[i][j]);
		}
	}
}

void CalculateNeed()
{
	for(i=0; i<n; i++)
	{
		for(j=0; j<m; j++)
		{
			need[i][j] = max[i][j] - alloc[i][j];
		}
	}
}

void AcceptAvailable()
{
	printf("Enter available vector:-\n");
	for(i=0; i<n; i++)
	{
		scanf("%d", &avail[i]);
	}
}

void Display()
{
	printf("\nAllocation\t\tMax\t\tNeed\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<m; j++)
		{
			printf("%4d", alloc[i][j]);
		}
		printf("\t");
		for(j=0; j<m; j++)
		{
			printf("%4d", max[i][j]);
		}

		printf("\t");
		CalculateNeed();
		for(j=0; j<n; j++)
		{
			printf("%4d", need[i][j]);
		}
		printf("\n");
		printf("%d", avail[i]);
	}
}

void main()
{
	printf("Enter no. of processes and resources:-\n");
	scanf("%d%d", &n, &m);
	AcceptAllocations();
	AcceptMax();
	AcceptAvailable();
	Display();
}
