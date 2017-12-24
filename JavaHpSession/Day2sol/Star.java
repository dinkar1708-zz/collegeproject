class Design
{
    Design()
    {
         int i,j;
         for(i=1;i<=5;i++)
         {
             for(j=5;j>i;j--)
             System.out.print(" ");
             for(j=1;j<=i;j++)
             System.out.print("*");
             System.out.println();
        }
    }
}
public class Star
{
	public static void main(String [] argv)
	{
	new Design();
	}
}