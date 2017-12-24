class Design
{
	int k=4;
	Design()
	{
	for(int i=1;i<=5;i++)
	 {
		for(int j=1;j<=5;j++)
		{			 	
		if(k<j)        
		{		
		System.out.print("*");		 
		}System.out.print("");	
		}
		System.out.println();
				k--;
	 }	
	}
}
public class DesignStar
{
	public static void main(String [] argv)
	{
	new Design();
	}
}