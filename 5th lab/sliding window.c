#include<stdio.h>

int ack();
int main()
{	
	int arr[10];
	int n,window;
	printf("enter the number of frames");
	scanf("%d",&n);
	printf("enter the window size");
	scanf("%d",&window);
	int i,j;
	for(i=0;i<n;i++)
	{
		arr[i]=i;
		
	}
	i=0,j=0;
	int t;
for(i=0;i<window;i++)
	{
		printf("frame %d is sent\n",i);
		
	}
	i=window;	
do
{  t=ack();
  if(t==0 )
	{
		printf("the ack is not recieved");
		break;
	}
	else if(t==1 && i!=n)
	{ 
	printf("the ack of %d sucessfully recieved\n",j);
	printf("frame %d is sent\n",i);
	j++;
		i++;	
	}
	else if(i==n && j!=n &&t==1)
	{  
		
		printf("the ack of %d sucessfully recieved\n",j);
		j++;
	}
	
	

	
	
}while(t==1 &&j<n);
		
return 0;
}
int ack()
{   int t;
	printf("Reciver:");
	scanf("%d",&t);
	
	return t;
	
}
