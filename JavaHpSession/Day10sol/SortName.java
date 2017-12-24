import java.io.*;
class Sort
{
  String []name=new String[2]; 
  String str;
  int i,j,len;
  public void sort(String []name1,int l)
  {
   len=l;
   for(i=0;i<len;i++)
   name[i]=name1[i];             
   for(i=1;i<len;i++)
   {
    for(j=0;j<len-1;j++)
    {  
     if((name[j]).compareTo(name[j+1])>0)
     {                  
      str=name[j];name[j]=name[j+1];name[j+1]=str;
     }
    }
   }
   System.out.println("Sorted Name:");
   for(i=0;i<len;i++)
   {
      System.out.println(name[i]);
    }
 
  }
}
class SortName
{
 public static void main(String []argv)throws IOException
 {
  String []name=new String[2];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("How many names are there?");
  int len=Integer.parseInt(br.readLine());
  for(int i=0;i<len;i++)
  {
      System.out.println("Enter the Name:");
      name[i]=br.readLine();
   }
   Sort ob=new Sort();
   ob.sort(name,len);
  }
}