#include<stdio.h>
#include<conio.h>
#include<malloc.h>
struct Node
{
	int data;
	struct Node* next;
	struct Node* prev;
};
typedef struct Node node;
void firstnode();
void insertbeg();
void insertend();
void insertpos();
void choiceinsert();
void delbeg();
void delend();
void delpos();
void choicedel();
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
	nptr->prev=NULL;
	return nptr;
}
void main()
{
	int ch,chins,chdel;
	clrscr();
	do
	{
		mainmenu:
		choice();
		printf("Enter your choice:-\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
			do
			{       choiceinsert();
				printf("Enter your choice:-\n");
				scanf("%d",&chins);
				switch(chins)
				{
				case 1:insertbeg();
				break;
				case 2:insertend();
				break;
				case 3:insertpos();
				break;
				case 4:display();
				break;
				case 5:goto mainmenu;
				break;
				case 6:exit(0);
				default:printf("Sorry! Wrong Choice.\n");
				}
			}while(1);
			break;
			case 2:
			do
			{       choicedel();
				printf("Enter your choice:-\n");
				scanf("%d",&chdel);
				switch(chdel)
				{
				case 1:delbeg();
				break;
				case 2:delend();
				break;
				case 3:delpos();
				break;
				case 4:display();
				break;
				case 5:goto mainmenu;
				break;
				case 6:exit(0);
				default:printf("Sorry! Wrong Choice.\n");
				}
			}while(1);
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
	printf("\n\t***Choice Menu for Doubly Linked List.***\n");
	puts("1.Insert.\n2.Delete.\n3.Display.\n4.Exit.\n");
}
void choiceinsert()
{
	puts("\n\t***Choice Menu to insert in to Doubly Linked List.****");
	printf("\n1.Insert at Begning.\n2.Insert at end.\n3.Insert at particular position.\n");
	puts("4.Display List.\n5.Go to main menu.\n6.Exit.\n");
}
void choicedel()
{
	puts("\n\t***Choice Menu for delete from Doubly Linked List.****");
	printf("\n1.Delete from Begning.\n2.Delete from end.\n3.Delete from particular position.\n");
	puts("4.Display List.\n5.Goto main menu.\n6.Exit.\n");
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
		START->prev=child;
		START=child;
		puts("Item inserted at begning of the list.\n");
	}
}
void insertend()
{
	node* temp=START;
	node* child;
	if(temp==NULL)
	{
	 firstnode();
	 return;
	}
	while(temp->next!=NULL)
	{
	temp=temp->next;
	}
	child=createnode();
	temp->next=child;
	child->prev=temp;
	puts("Item inserted at the end of the list.\n");
}
void insertpos()
{
	node* child;
	node* temp=START;
	node* pos;
	int position,i=1,nodecount=0;
	while(temp!=NULL)
	{
		nodecount++;
		temp=temp->next;
	}
	puts("Enter the position:-\n");
	scanf("%d",&position);
	if(START==NULL)
	{
		printf("Sorry! List is empty first insert some item then give position.\n");
		return;
	}
	if(START->next==NULL)
	{
		insertbeg();
		return;
	}
	if(position<1||position>nodecount+1)
	{
		puts("Sorry! wrong position.\n");
		return;
	}
	temp=START;
	while(i!=position-1)
	{
		temp=temp->next;
		i++;
	}
	pos=temp->next;
	child=createnode();
	temp->next=child;
	child->prev=temp;
	child->next=pos;
	pos->prev=child;
	printf("Item inserted at %d position.\n",position);
}
void delbeg()
{
	node* temp=START;
	if(START==NULL)
	{
		puts("List is already empty so you can not delete.\n");
		return;
	}
	if(START->next==NULL)
	{
		printf("Item %d deleted.\n",START->data);
		free(temp);
		START=NULL;
		return;
	}
	else
	{
		temp=START;
		printf("Item %d deleted.\n",START->data);
		START=START->next;
		START->prev=NULL;
		free(temp);
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
		temp->prev=NULL;
		printf("\n%d Item deleted.\n",temp->data);
		free(temp);

	}
}
void delpos()
{
	node* temp=START;
	node* temp2;
	node* posdel;
	int position,i=1,nodecount=0;
	while(temp!=NULL)
	{
		nodecount++;
		temp=temp->next;
	}
	if(START==NULL)
	{
		puts("List is already empty so you can not delete.\n");
		return;
	}
	puts("Enter the position:-\n");
	scanf("%d",&position);
	if(START->next==NULL)
	{
		printf("Item %d deleted.\n",START->data);
		free(temp);
		START=NULL;
		return;
	}
	if(position<1||position>nodecount)
	{
		puts("Sorry! wrong position.\n");
		return;
	}
	temp=START;
	while(i!=position-1)
	{
		temp=temp->next;
		i++;
	}
	posdel=temp->next;
	temp2=posdel->next;
	temp->next=temp2;
	temp2->prev=temp;
	printf("Item %d deleted.\n",posdel->data);
	free(posdel);
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