#include<stdio.h>
#include<stdlib.h>
#include<mpi.h>

int main(int argc, char **argv[])
{
	MPI_Init(&argc, &argv);
	int rank, size;
	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
	MPI_Comm_size(MPI_COMM_WORLD, &size);
	int ele = 1000/size;
	srand(rank);
	int local[ele];
	for(int i=0; i<ele; i++)
	{
		local[i] = rand();
	}
	int all[1000];
	MPI_Gather(local, ele, MPI_INT, all, ele, MPI_INT, 0, MPI_COMM_WORLD);
	if(rank == 0)
	{
		printf("Generated numbers:-\n");
		for(int i=0; i<1000; i++)
		{
			printf("%d\t", all[i]);
		}
		printf("\n");
	}

	MPI_Finalize();
	return 0;
}
