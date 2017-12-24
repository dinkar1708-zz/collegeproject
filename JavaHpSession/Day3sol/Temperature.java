import java.io.*;
class Temp
{ 
	double celsius[]=new double[100];
	double Fahrenheit[]=new double[100];
	Temp(double celsius1[])	
	{
	 for(int i=0;i<3;i++)
	 {
	  celsius[i]=celsius1[i];
          Fahrenheit[i]=9*(celsius1[i])/32+5;	  
	 }
	 System.out.println("Celsius\t\t\t\tFahrenheit");
	 for(int i=0;i<3;i++)
	 {
	   System.out.println(celsius1[i]+"\t\t\t\t"+Fahrenheit[i]);
	 }	
	 
	}
}
public class Temperature
{
	public static void main(String [] argv) throws IOException
	{
	double celsius[]=new double[100];	
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	for(i=0;i<3;i++)
	{
	System.out.println("Enter the temperature in celsius:-\t");
	celsius[i]=Double.parseDouble(br.readLine());
        }	
	new Temp(celsius);	
	}
}
		