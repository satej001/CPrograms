#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct file
{
	char name[20];
	int start;
	int length;
	struct file *next;
};

int main()
{
	int n, nf, i, start, length;
	char fname[20];
	printf("Enter no. of blocks ==> ");
	scanf("%d", &n);
	struct file *files = NULL;
	while(1)
	{
		printf("[1] CREATE NEW FILE.\n");
		printf("[2] DELETE FILE.\n");
		printf("[3] DISPLAY DISK SCHEDULE.\n");
		printf("[4] EXIT!\n");
		printf("Enter Your Option ==> ");
		scanf("%d", &i);
		switch(i)
		{
			case 1: printf("Enter the file name ==> ");
				scanf("%s", &fname);
				printf("Enter starting block ==> ");
				scanf("%d", &start);
				printf("Enter length of a file ==> ");
				scanf("%d", &length);
				if(start + length > n)
				{
					printf("File Allocation Failed!!\n");
				}
				else
				{
					struct file *new_file = (struct file)malloc(sizeof(struct file));
					new_file->next = NULL;
					strcpy(new_file->name, fname);
					new_file->start = start;
					new_file->length = length;
					if(files == NULL)
					{
						files = new_file;
					}
					else
					{
						struct file *ptr = files;
						while(ptr->next != NULL)
						{
							ptr = ptr->next;
						}
						ptr->next = new_file;
					}
					printf("File %s created successfully!!\n", fname);
				}
				break;

			case 2: printf("Enter the name of a file ==> ");
				scanf("%s", &fname);
				struct file *ptr = files;
				struct file *prev = NULL;
				while(ptr != NULL && strcmp(ptr->name, fname) != 0)
				{
					prev = ptr;
					ptr = next;
				}
				if(ptr == NULL)
				{
					printf("File Deletion Failed!!\n");
				}
				else
				{
					if(prev == NULL)
					{
						files = ptr->next;
					}
					else
						prev->next = ptr->next;
				}
				break;

			case 3: printf("Disk Status:-\n");
				int *blocks = (int*)calloc(n,sizeof(int));
				ptr = files;
				while(ptr != NULL)
				{
					for(i=p->start; i<ptr->start + ptr->length; i++)
					{
						blocks[i] = 1;
					}
					ptr = ptr->next;
				}
				for(i=0; i<n; i++)
				{
					if(blocks[i] == 0)
					{
						printf("Blocks %d are free!!\n", i);
					}
					else
					{
						printf("Blocks %d are allocated!!\n", i);
					}
				}
				free(blocks);
				break;

			case 4: return 0;

			default: printf("Invalid Choice!!\n");
		}
	}
}
