import java.util.Scanner;
class Sum
{
	int matrix1[][]=new int[3][3];
	int matrix2[][]=new int[3][3];
	Sum(int m1[][],int m2[][])
	{
	 for(int i=0;i<3;i++)
	 {
	  for(int j=0;j<3;j++)
	  {
	   matrix1[i][j]=m1[i][j]; 
	   matrix2[i][j]=m2[i][j]; 		
	  }	  
         }
	System.out.println("The sum of the 3*3 matrix:-");
	for(int i=0;i<3;i++)
	{
	 for(int j=0;j<3;j++)
	 {
	  System.out.print(matrix1[i][j]+matrix2[i][j]+"\t");
	 }	  
	 System.out.println();
        }
	}
	  	}
public class MatrixSum
{
	public static void main(String []argv)
	{
	Scanner scanner=new Scanner(System.in);
	int [][]a=new int[3][3];
	int [][]b=new int[3][3];
	System.out.println("Enter the first 3*3 matrix:-");
	for(int i=0;i<3;i++)
	{
	 for(int j=0;j<3;j++)
	 {
	  a[i][j]=scanner.nextInt(); 
	 }	  
        }
	System.out.println("Enter the second 3*3 matrix:-");
	for(int i=0;i<3;i++)
	{
	 for(int j=0;j<3;j++)
	 {
	  b[i][j]=scanner.nextInt(); 
	 }	  
        }
	new Sum(a,b);	
       }
}
	