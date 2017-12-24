import java.io.*;
class Table
{
	public void calculate(int number)
	{
	   int i;
	   for(i=1;i<=10;i++)
	   {
		System.out.println(number+"*"+i+"="+number*i);
	   }
		
	}
}
class TableNumber
{
	public static void main(String [] argv) throws IOException
	{
	int num;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number:-\t");
	num=Integer.parseInt(br.readLine());	 
	Table ob=new Table();
	ob.calculate(num);
	}
}
		