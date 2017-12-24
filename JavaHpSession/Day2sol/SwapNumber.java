import java.io.*;
class Swap
{
	public void swaping(int x,int y)
	{
	System.out.println("Before swaping a="+x+" b="+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After swaping a="+x+" b="+y);
	}
}
class SwapNumber
{
	public static void main(String [] argv) throws IOException
	{
	int a,b;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first number:-\t");
	a=Integer.parseInt(br.readLine());
	System.out.println("Enter the second number:-\t");
	b=Integer.parseInt(br.readLine());	
	Swap ob=new Swap();
	ob.swaping(a,b);
	}
}
		