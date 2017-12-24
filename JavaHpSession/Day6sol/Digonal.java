public class Digonal
{
	public static void main(String []argv)
	{
	 
	int [][]array={{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<3;i++)
	{
	 for(int j=0;j<3;j++)
	 {
	  if(i==j||i+j==2)
	  System.out.print(array[i][j]+"\t");
	  else
	  System.out.print(" "+"\t");
	 }
	 System.out.println();
        }
	
       }
}
	