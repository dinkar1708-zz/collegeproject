#include<stdio.h>
#include<conio.h>
struct node
{
	int data;
	int index;
	struct node*next;
};
typedef struct node node;
node*start=NULL;

void main()
{
	node* ptr;
	node* disp;
	node* crnt;
	node*p;
	node*q;
	int info;
	int i=1,len=5,search,t,j,loc=0;
	node* beg=start;
	node*end;
	node* mid;
	clrscr();
	printf("Sorting By link list:-\n");
	for(i=0;i<len;i++)
	{
	ptr=(node*)malloc(sizeof(node));
	printf("Enter the value\n");
	scanf("%d",&info);
	ptr->data=info;
	ptr->index=i;
	ptr->next=NULL;
	if(start==NULL)
	start=ptr;
	else
	{
		crnt=start;
		while(crnt->next!=NULL)
		crnt=crnt->next;
		crnt->next=ptr;
	}
	}
	for(p=start;p->next!=NULL;p=p->next)
	{
		for(q=start;q->next!=NULL;q=q->next)
		{
			if(q->data>((q->next)->data))
			{
				t=q->data;
				(q->data)=((q->next)->data);
				((q->next)->data)=t;
			}
		}
	}
	disp=start;
	while(disp!=NULL)
	{
	printf(":%d %d:",disp->data,disp->index);
	disp=disp->next;
	}
	getch();
}
