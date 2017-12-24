#include<stdio.h>
#include<conio.h>
#define MAX 3
void push();
void pop();
void choice();
void display();
int TOP=-1;
int stack[MAX];
void main()
{
	int i,ch;
	clrscr();
	do
	{       choice();
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
			case 4:exit(0);
			default:printf("Sorry! Wrong Choice.\n");
		}

	}while(1);
}
void choice()
{
	puts("\n\t***Stack Operation By Array***");
	printf("\n1.Push.\n2.Pop\n3.DisplayStack\n4.Exit.\n");
}
void push()
{
	int value;
	if(TOP==MAX-1)
	{
		printf("OVERFLOW! Stack is full!\n");
		getch();
		return;
	}
	else
	{
		puts("Enter the value to put in to stack:-\n");
		scanf("%d",&value);
		stack[++TOP]=value;
		puts("Item Pushed successfully.\n");
	}
}
void pop()
{
	if(TOP==-1)
	{
		puts("UNDERFLOW! Sorry! Stack is empty");
		return;
	}
	else
	{
		TOP--;
		puts("Item Poped successfully.\n");
	}
}
void display()
{
	int i;
	if(TOP==-1)
	{
		printf("Stack is empty!\n");
		return;
	}
	else
	{
		puts("Content of the stack is:-\n");
		for(i=TOP;i>=0;i--)
		printf(":%d\t",stack[i]);
	}
}