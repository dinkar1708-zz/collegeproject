#include<stdio.h>
#include<conio.h>
#include<malloc.h>
struct Node
{
	int data;
	struct node* next;
};
typedef struct Node node;
void display();
void choice();
void push();
void pop();
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
			case 1:push();
			break;
			case 2:pop();
			break;
			case 3:display();
			break;
			case 4: exit(0);
			default:printf("Sorry! Wrong Choice.\n");
		}
	}while(1);
}
void choice()
{
	printf("\n\t***Choice Menu for Dynamic Stack.***\n");
	puts("1.Push to stack.\n2.Pop from stack.");
	puts("3.Display.\n4.Exit.\n");;
}
void firstnode()
{
	START=createnode();
	puts("First item is inserted on to stack.\n");
}
void push()
{
	node* child;
	if(START==NULL)
	firstnode();
	else
	{
		child=createnode();
		child->next=START;
		START=child;
		puts("Item is pushed at begning of the list.\n");
	}
}
void pop()
{
	node* temp=START;
	if(START==NULL)
	{
		puts("Stack is already empty so you can not delete.\n");
		return;
	}
	if(START->next==NULL)
	{
		printf("Item %d poped.\n",START->data);
		free(temp);
		START=NULL;
		return;
	}
	else
	{
		temp=START;
		printf("Item %d poped.\n",START->data);
		START=START->next;
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