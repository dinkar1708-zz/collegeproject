import javax.swing.JOptionPane;
import java.lang.Math;
interface cInterface
{
  void input(double n1,double n2);
  void addition();
  void subtraction();
  void multiplication();
  void square();
  void cube();
  void power();
  void factorial();
}
class UserCalculator implements cInterface
{
	double num1,num2;	 
	public void input(double n1,double n2)
	{
	 num1=n1;num2=n2;
	}
	public void addition( )
	{
	 
	 System.out.println("The addtion ="+(num1+num2));
	}
	public void subtraction( )
	{	  
	 System.out.println("The subtraction ="+(num1-num2));
	}
	public void multiplication( )
	{	  
	 System.out.println("The multiplication ="+(num1*num2));
	}
	public void division( )
	{		  
	 System.out.println("The divison ="+num1/num2);
	}	
         public void square()
	{
	 System.out.println("The square of first number="+num1*num1);
	 System.out.println("The square of second number="+num2*num2);
	}
	public void cube()
	{ 
	 System.out.println("The cube of first number ="+num1*num1*num1);	
	System.out.println("The cube of first number ="+num2*num2*num2);	
	}
	public void power()
	{ 
	  double p=Math.pow(num1,num2);
	  System.out.println("The of the first number to second number="+p);
	}
	public void factorial()
	{
	 double fact1=1,fact2=1;
	 while(num1>0)
	 {
	 fact1*=num1;
	 num1--;
	 }
	System.out.println("The factorial of the first number="+fact1);
	 while(num2>0)
	 {
	 fact2*=num2;
	 num2--;
	 }
	System.out.println("The factorial of the first number="+fact2);
	}
}
class Calculator
{
   public static void main(String [] argv)
	{
	double num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the first number"));
	double num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the second number"));		 
	UserCalculator ob=new UserCalculator();
	ob.input(num1,num2);
	ob.addition();
	ob.subtraction();
	ob.multiplication();
	ob.division();	
 	ob.square();
	ob.cube();ob.power();ob.factorial();
	}
}