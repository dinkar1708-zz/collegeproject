import java.io.*;
class Overloading 
{
 int num1,num2,num3,sum=0;
 public void add(int n1)
 {
   num1=n1;
   System.out.println("Sum of first number="+(sum+num1));
 }
 public void add(int n1,int n2)
 {
   num2=n2; 
   System.out.println("Sum of two number="+(sum+num1+num2));
 }
 public void add(int n1,int n2,int n3)
 {
   num3=n3; 
   System.out.println("Sum of three number="+(sum+num1+num2+num3));
  }
}
class MethodODemo
{
 public static void main(String []argv)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int n1,n2,n3;
  Overloading ob=new Overloading();
  System.out.println("Enter the first number");
  n1=Integer.parseInt(br.readLine());

  System.out.println("Enter the second number");
  n2=Integer.parseInt(br.readLine());

  System.out.println("Enter the third number");
  n3=Integer.parseInt(br.readLine());
  ob.add(n1);
  ob.add(n1,n2);
  ob.add(n1,n2,n3);
 }
}