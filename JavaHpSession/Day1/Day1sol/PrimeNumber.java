import java.io.*;
class prime
{
	int num,i,count=0;
	prime()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number:-\t");
	num=Integer.parseInt(br.readLine());
	for(i=1;i<=num;i++) 
	{
		if(num%i==0)
		count++;		
	}	 
	if(count==2)
	System.out.println("Prime number");
	else
	System.out.println("Not a prime number");
	}
}	
class PrimeNumber
{
	public static void main(String[] argv)throws IOException
	{
	new prime();
	}
}