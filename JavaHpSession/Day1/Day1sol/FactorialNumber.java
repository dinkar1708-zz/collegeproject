import java.io.*;
class factorial
{
	int num,fact=1;
	factorial()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number:-\t");
	num=Integer.parseInt(br.readLine());
	while(num>0)	 
	{
	fact*=num;
	num--;
	}
  	System.out.println("The factorial is:-\t"+fact);
	}
}	
class FactorialNumber
{
	public static void main(String[] argv)throws IOException
	{
	new factorial();
	}
}