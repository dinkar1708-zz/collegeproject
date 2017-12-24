import java.util.Scanner;
import java.lang.*;
class Conversion
{
	long binaryNumber;
	long decimal=0;
	Conversion(long b)
	{
	 binaryNumber=b;
	 int i=0;
	 while(binaryNumber>0)
	 {
	   long digit=binaryNumber%10;
	   decimal+=(digit*(Math.power(2,i)));
	 }
	 System.out.println(decimal);
	}
}
class Bcdecimal
{
	public static void main(String [] argv)
	{
	long binary;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number in biary number");
	binary=Long.parseLong(scanner.nextLine());
	new Conversion(binary);
	}
}