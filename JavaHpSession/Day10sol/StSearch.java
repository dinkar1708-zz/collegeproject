import java.io.*;
class Search
{
  int [][]roll=new int[2][2];
  String [][]name=new String[2][2]; 
  int rSearch,check=0,i,j,row,col;
  public void search(String [][]name1,int [][]roll1,int rS)
  {
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
       roll[i][j]=roll1[i][j];
       name[i][j]=name1[i][j];
     }
   } 
  rSearch=rS;  
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    { 
     if(rSearch==roll[i][j])
     {
     row=i;col=j;
	System.out.println(row+col);
     check++;
     break;
     }
   } 
  }
  if(check==0)
  System.out.println("Roll Number Not found");
  else
  System.out.println("The name="+name[row][col]);
 }
}
class StSearch
{
 public static void main(String []argv)throws IOException
 {
  int [][]roll=new int[2][2];
  String [][]name=new String[2][2];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  for(int i=0;i<2;i++)
  {
    for(int j=0;j<2;j++)
    {
      System.out.println("Enter the Name:");
      name[i][j]=br.readLine();
      System.out.println("Enter the RollNumber:");
      roll[i][j]=Integer.parseInt(br.readLine());
     }
   }
   System.out.println("Enter the roll number to sarch:-");
   int s=Integer.parseInt(br.readLine());
   Search ob=new Search();
   ob.search(name,roll,s);
  }
}