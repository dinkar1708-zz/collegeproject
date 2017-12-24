import java.io.*;
class Area
{
        double circleRadius,cylenderRadius,cHeight;
	final float PI=3.14f;
	public void areaOfCircle(double r)
	{
		circleRadius=r;
		System.out.println("Area of circle="+PI*circleRadius*circleRadius);
			
	}
	public void areaOfCylinder(double r,double h)  
	{
		cylenderRadius=r;
		cHeight=h;
		double sArea=2*PI*cylenderRadius*cHeight;
		System.out.println("Surface Area of cylender="+sArea);
	}
}
public class AreaOfCC 
{
	public static void main(String [] argv) throws IOException
	{
	double circleRadius,cylenderRadius,cHeight;	
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the radius of circle:-\t");
	circleRadius=Double.parseDouble(br.readLine());
        System.out.println("Enter the radius of cylender:-\t");
	cylenderRadius=Double.parseDouble(br.readLine());
        System.out.println("Enter the height of cylender:-\t");
	cHeight=Double.parseDouble(br.readLine());         
	Area ob=new Area();
	ob.areaOfCircle(circleRadius);
	ob.areaOfCylinder(cylenderRadius,cHeight);	
	}
}
		