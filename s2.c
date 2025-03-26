#include<stdio.h>
#define r 10
#define c 10
int alloc[r][c], avail[r], max[r][c], need[r][c], work[r], req[r], finish[r];
int i, j, n, m;

void AcceptMatrix()
{
	printf("Enter matrix for maximum:-\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<m; j++)
		{
			scanf("%d", &max[i][j]);
		}
	}

	printf("Enter matrix for allocation:-\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<m; j++)
		{
			scanf("%d", &alloc[i][j]);
		}
	}

	printf("Enter available instances:-\n");
	for(i=0; i<m; i++)
	{
		scanf("%d", &avail[i]);
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

void DisplayMatrix()
{
	printf("\nAllocation\t\tMax\t\tNeed\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<m; j++)
		{
			printf("%d", alloc[i][j]);
		}
		printf("\t");
		for(j=0; j<m; j++)
		{
			printf("%d", max[i][j]);
		}
		printf("\t");
		for(j=0; j<m; j++)
		{
			printf("%d", need[i][j]);
		}
	}
}

void AcceptRequest()
{
	int proc;
	printf("Enter process no:-\n");
	scanf("%d", &proc);
	for(i=0; i<m; i++)
	{
		scanf("%d", &req[i]);
	}
}

int CompareNeed(int p)
{
	int i, j, flag=0;
	for(j=0; j<m; j++)
	{
		if(need[p][j] > work[j])
		{
			flag = 1;
			break;
		}
	}

	if(flag == 0)
		return p;
	return 1;
}


void SafetyAlgo()
{
	int over = 0, k, L=0, flag, pno, safe[r];
	for(i=0; i<m; i++)
	{
		work[i] = avail[i];
	}
	while(!over)
	{
		for(i=0; i<n; i++)
		{
			if(finish[i] == 0)
			{
				flag = 0;
				pno = CompareNeed(i);
				if(pno > -1)
					break;
			}
		}
		if(i==n)
		{
			printf("System is in unsafe state!\n");
			exit(1);
		}

		if(i < n && pno >= 0)
		{
			for(k=0; k<m; k++)
			{
				work[k] += alloc[pno][k];
			}
			finish[pno] = 1;
			safe[L++] = pno;
			if(L >= n)
			{
				for(L=0; L<n; L++)
				{
					printf("p%d\t", safe[L]);
					over = 1;
				}
			}
		}
	}
}

void ResourceRequestAlgo()
{
	int proc;
	for(i=0; i<m; i++)
	{
		if(req[i] > need[proc][i])
		{
			printf("Process exceeds max demand:-\n");
			exit(1);
		}
	}
	for(i=0; i<m; i++)
	{
		if(req[i] > avail[i])
		{
			printf("Process must wait, resources are not available yet...\n");
			exit(1);
		}

		avail[i] = avail[i] - req[i];
		alloc[proc][i] = alloc[proc][i] + req[i];
		need[proc][i] = need[proc][i] - req[i];
	}
	SafetyAlgo();
}

void Bankers()
{
	ResourceRequestAlgo();
}

void main()
{
	printf("Enter no. of processes and resources:-\n");
	scanf("%d%d", &n, &m);
	AcceptMatrix();
	CalculateNeed();
	DisplayMatrix();
	AcceptRequest();
	Bankers();
}
