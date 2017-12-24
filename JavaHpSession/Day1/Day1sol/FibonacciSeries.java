import java.io.*;
class fibonacci
{
	int i=1,j=1,k=1,n;
	fibonacci()
	{	 
	System.out.println("The fibonacci series is:-");
	 for(n=1;n<20;n++)
	 {  
  	  System.out.print(k+"\t");
	  k=i+j;
	  i=j;
	  j=k;
	 }
	}
}	
class FibonacciSeries
{
	public static void main(String[] argv)
	{
	new fibonacci();
	}
}