import java.util.Scanner;
class Test
{
	int num,tempNum;
	Test(int n)
	{
		num=n;//Number initialized.
	}
	public void getReverse()
	{
	int totDigit=0,cal,rev=0,digit;
	System.out.println("The given number is:-"+num);
	tempNum=num;
	while(tempNum>0)
	{
		totDigit++;
		tempNum/=10;
	}cal=(int)Math.pow(10,(totDigit-1));
	while(num>0)
	{
		digit=num%10;
		rev+=cal*digit;
		num/=10;
		cal/=10;
	} 
	System.out.println("The reverse Number is:-"+rev);	 
	}
}
public class ReverseNumber
{
	public static void main(String [] argv)
	{
	int num;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number:-");
	num=scanner.nextInt();
	Test ob=new Test(num);
	ob.getReverse();
	}
}