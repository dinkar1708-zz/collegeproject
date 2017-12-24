import java.io.*;
class armstrong
{
	int num,a,b,c,d;
	armstrong()
	{
	 System.out.println("The armstrong numbers are:-");
	 for(num=100;num<999;num++) 
	 {
	  a=num%10;
	  b=(num%100)/10;
	  c=num/100;
	  if((a*a*a+b*b*b+c*c*c)==num)
	  System.out.println(num);	
	 } 	 

	}
}	
class ArmstrongNumber
{
	public static void main(String[] argv)
	{
	new armstrong();
	}
}