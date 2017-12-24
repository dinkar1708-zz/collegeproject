#include<stdio.h>
#include<conio.h>
#include<malloc.h>
struct Node
{
	int data;
	struct node* next;
};
typedef struct Node node;
void firstnode();
void insertbeg();
void delend();
void display();
void choice();
node* START=NULL;
node* createnode()
{
	int item;
	node* nptr;
	printf("Enter the item:-\n");
	scanf("%d",&item);
	nptr=(node*)malloc(sizeof(node));
	nptr->data=item;
	nptr->next=NULL;
	return nptr;
}
void main()
{
	int ch;
	clrscr();
	do
	{
		mainmenu:
		choice();
		printf("Enter your choice:-\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:insertbeg();
			break;
			case 2:delend();
			break;
			case 3:display();
			break;
			case 4:exit(0);
			default:printf("Sorry! Wrong Choice.\n");
		}
	}while(1);
}
void choice()
{
	printf("\n\t***Choice Menu for Dynamic Queue.***\n");
	puts("1.Insert.\n2.Delete.\n3.Display.\n4.Exit.\n");
}
void firstnode()
{
	START=createnode();
	puts("First node is created.\n");
}
void insertbeg()
{
	node* child;
	if(START==NULL)
	firstnode();
	else
	{
		child=createnode();
		child->next=START;
		START=child;
		puts("Item inserted at begning of the list.\n");
	}
}
void delend()
{
	node* temp;
	node* previous;
	if(START==NULL)
	{
		puts("List is already empty so you can not delete.\n");
		return;
	}
	else if(START->next==NULL)
	{
		temp=START;
		printf("Item %d deleted from the end of the list.\n",temp->data);
		free(temp);
		START=NULL;
		return;
	}
	else
	{
		temp=START;
		while(temp->next!=NULL)
		{
			previous=temp;
			temp=temp->next;
		}
		previous->next=NULL;
		printf("\n%d Item deleted.\n",temp->data);
		free(temp);

	}
}
void display()
{
	node* disp;
	disp=START;
	puts("The list is following:-\n");
	if(START==NULL)
	{
		printf("List is empty.");
		return;
	}
	else
	{
		while(disp!=NULL)
		{
			printf(":%d",disp->data);
			disp=disp->next;
		}
	}
}