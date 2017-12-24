import java.io.*;
class Palindrome
{
	int number,i=0,k,check=0,l;
	int stack[]=new int[100];
	Palindrome(int num)
	{
	  number=num;
	  while(number>0)
	  {
		stack[i++]=number%10;
		number/=10;
	  }	 
	l=i-1;
	for(k=0;k<i/2;k++)
	{
	  if(stack[l]==stack[k])
	  {
	  check++;	   
	  l--;
	  }
	}
	if(check!=0)
	System.out.println("Palindrome Number");
	else
	System.out.println("Not a Palindrome Number");
	}
}
class PalindromeNumber
{
	public static void main(String [] argv) throws IOException
	{
	int number;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number:-\t");
	number=Integer.parseInt(br.readLine());
	new Palindrome(number) ;
	}
}
		