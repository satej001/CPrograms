//SSTF-Algo
#include<stdio.h>
#include<stdlib.h>

void main()
{
	int i, j, n, init, total=0, minD, index, dist, temp;
	printf("Enter no. of queue requests ==> ");
	scanf("%d", &n);
	int q[n];
	printf("Enter request queue:-\n");
	for(i=0; i<n; i++)
	{
		scanf("%d", &q[i]);
	}
	printf("Enter initial head position ==> ");
	scanf("%d", &init);
	for(i=0; i<n; i++)
	{
		minD = abs(q[i] - init);
		index = i;
		for(j=i+1; j<n; j++)
		{
			dist = abs(q[j] - init);
			if(dist <= minD)
			{
				minD = dist;
				index = j;
			}
		}
		total += minD;
		temp = q[i];
		q[i] = q[index];
		q[index] = temp;
		init = q[i];
	}
	printf("Total head movements %d\n", total);
}
