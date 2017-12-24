import java.util.Scanner;
import logicgate.AndClass;
import logicgate.OrClass;
import logicgate.NotClass;
class LogicgateImporting
{
	public static void main(String [] argv)
	{
	int value,bit1,bit2;
	System.out.println("This is the class which import the logic gate class");
	Scanner scanner=new Scanner(System.in);
	int ch;
	do
	{	
	new Choice();		
	System.out.println("Enter your choice:-");
	ch=scanner.nextInt();			
	switch(ch)
	{
		case 1:	
		System.out.println("Enter the first bit:-");
	        bit1=scanner.nextInt();
		System.out.println("Enter the second bit:-");
		bit2=scanner.nextInt();
	
		AndClass ob1=new AndClass();
	        value=ob1.doOperationAnd(bit1,bit2);
		System.out.println("The result is:-\t"+value);
		break;
		case 2:
		System.out.println("Enter the first bit:-");
		bit1=scanner.nextInt();
		System.out.println("Enter the second bit:-");
		bit2=scanner.nextInt();
		OrClass ob2=new OrClass();
		value=ob2.doOperationOr(bit1,bit2);
		System.out.println("The result is:-\t"+value);
		break;		
		case 3:
		System.out.println("Enter the bit:-");
		bit1=scanner.nextInt();
		NotClass ob3=new NotClass();
		value=ob3.doOperationNot(bit1);
		System.out.println("The result is:-\t"+value);
		break;
		case 4:System.exit(1);
		break;
		default:System.out.println("Sorry! woring choice.");			
	}
	}while(true);
	}	
}
class Choice
{
	Choice()
	{
	System.out.println("1.And gate Operation.");
	System.out.println("2.Or gate Operation.");
	System.out.println("3.Not gate Operation.");
	System.out.println("4.exit.");
	
	}
}
	