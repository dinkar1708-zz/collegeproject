import java.util.Scanner;
class CCount
{
 public static void main(String []argv)
 {
  Scanner sc=new Scanner(System.in);
  String s=new String();
  char []cha=new char[100];
  System.out.println("Enter a string:");
  s=sc.next();
  System.out.println(s);
  String s1=s;
  for(int i=0;i<s.length();i++)
  {
   cha[i]=s.charAt(i);
  }
  System.out.println("The character array");
  for(int i=0;i<s.length();i++)
  {
   System.out.print(cha[i]);
  }

   
 }
}