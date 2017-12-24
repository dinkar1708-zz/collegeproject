import java.io.*;
public class CapitalName
{
 public static void main(String []argv)throws IOException
 {
  String name;
  int brk,j;
  do
  {
  int len,i,check=0;
  j=0;brk=0;    
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the name in Capital letters:-");
  name=br.readLine();
  len=name.length();
  j++;
  for(i=0;i<len;i++)
  {
   char ch=name.charAt(i);
   if(ch>=97&&ch<=122)   
   check++;
  }
  if(check!=0) 
  {
  System.out.println("Names are not in Capital letter");
  }
  else
  {
  System.out.println("Names are in Capital letter");
  brk=j;
  }  
  }while(brk!=j);
 }
}