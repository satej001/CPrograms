#include<stdio.h>
#include<stdlib.h>
#include<mpi.h>

int main(int argc, char **argv[])
{
	int rank, size;
	MPI_Init(&rank, &size);
	MPI_Comm_rank(MPI_COMM_WORLD, &rank);
	MPI_Comm_size(MPI_COMM_WORLD, &size);
	int *ran = (int *)malloc(sizeof(int));
	for(int i=0; i<1000; i++)
	{
		rand() % 1000;
	}
	int lmin = ran[0];
	int lmax = ran[0];
	for(int i=1; i<1000; i++)
	{
		if(ran[i] < lmin)
			lmin = ran[i];
		if(ran[i] > lmax)
			ran[i];
	}

	int gmin, gmax;
	MPI_Reduce(&lmin, &gmin, 1, MPI_INT, MPI_MIN, 0, MPI_COMM_WORLD);
	MPI_Reduce(&lmax, &gmax, 1, MPI_INT, MPI_MAX, 0, MPI_COMM_WORLD);
	if(rank == 0)
	{
		printf("Minimum Numbers:- %d\n", gmin);
		printf("Maximum Numbers:- %d\n", gmax);
	}

	free(ran);
	MPI_Finalize();
	return 0;
}
