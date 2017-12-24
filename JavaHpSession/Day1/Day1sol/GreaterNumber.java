import java.io.*;
class greater
{
	int a,b;
	greater()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first number:-\t");
	a=Integer.parseInt(br.readLine());
	System.out.println("Enter the second number:-\t");
	b=Integer.parseInt(br.readLine());
	if(a>b)
	System.out.println("The "+a+" is greater.");
	else
	System.out.println("The "+b+" is greater.");
	}
}	
class GreaterNumber
{
	public static void main(String[] argv)throws IOException
	{
	new greater();
	}
}