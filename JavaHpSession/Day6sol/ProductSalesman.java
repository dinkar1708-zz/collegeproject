import java.util.Scanner;
class Company
{
	int sales[][]=new int[4][4],rs1=0,rs2=0,rs3=0,rs4=0;	
	int cs1=0,cs2=0,cs3=0,cs4=0; 
	Company(int s[][] )
	{
	 for(int i=0;i<4;i++)
	 {
	  for(int j=0;j<4;j++)
	  {	   
	   sales[i][j]=s[i][j]; 	  
	  }	  
         }
	System.out.println("Salesman No.\tProd1\t\tProd2\t\tProd3\t\tProd4\t\tTotal ");
	for(int i=0;i<4;i++)
	{	 
	 for(int j=0;j<4;j++)
	 {
	   if(i==0)
	   rs1+=sales[i][j];
	   if(i==1)
	   rs2+=sales[i][j];
	   if(i==2)
	   rs3+=sales[i][j];
	   if(i==3)
	   rs4+=sales[i][j];
	   
	   if(j==0)
	   cs1+=sales[i][j];
	   if(j==1)
	   cs2+=sales[i][j];
	   if(j==2)
	   cs3+=sales[i][j];
	   if(j==3)
	   cs4+=sales[i][j]; 
	 }	  
	}
	for(int i=0;i<4;i++)
	{
	System.out.print(i+1);
	 for(int j=0;j<4;j++)
	 { 
          if(sales[i][j]==0)
	  System.out.print("\t\t"+"---");
	  else if(j==0)
	  System.out.print("\t\t"+sales[i][j]);  
    	  else
	  System.out.print("\t\t"+sales[i][j]);	  
	 }	
	 System.out.print("\t\t\t");
	 if(i==0)
	 System.out.print(rs1);
	 if(i==1)
	 System.out.print(rs2);
	 if(i==2)
	 System.out.print(rs3);
	 if(i==3)
	 System.out.print(rs4);
	 System.out.println();
        }
	System.out.print("Prod Total"+"\t"+cs1+"\t\t"+cs2+"\t\t"+cs3+"\t\t"+cs4);
	}
}
public class ProductSalesman
{
	public static void main(String []argv)
	{
	Scanner scanner=new Scanner(System.in);
	int [][]sales=new int[4][4];	 	
	int check=0;	 
	String ch;
	System.out.println("Enter the product price.");
	for(int i=0;i<4;i++)
	{
	 for(int j=0;j<4;j++)
	 {
	  System.out.println("You want to choose the product(y/n)");
	  ch=scanner.next();	  
	  if(ch.equals("y"))
	  {
	  System.out.println("Enter the product of SalesMan");
	  sales[i][j]=scanner.nextInt();
          }
	  else
	  {
	  sales[i][j]=0;		
	  }
	 }	  
        }
	new Company(sales);	
       }
}
	