import java.io.*;
class MSheet
{
 String name,college;
 int rollNumber,total=0;
 int []marks=new int[5];
 double per;
 public void input(String n,String c,int r,int []m)
 {
  name=n;
  college=c;
  rollNumber=r;
  for(int i=0;i<5;i++)
  {
    marks[i]=m[i];
  }
 }
  public void display()
  {
  
  System.out.println("Marksheet");  
  System.out.println("-------------------------------");
  System.out.println("Name\t:\t"+name);
  System.out.println("Roll No\t:\t"+rollNumber);
  System.out.println("College\t:\t"+college);
  System.out.println("-------------------------------");
  System.out.println("Subject\t:\tmarks");
  { 
   for(int i=0;i<5;i++)
    {
    System.out.println("Sub"+i+1+"\t:\t"+marks[i]);
    total+=marks[i];      
    }
   }
  per=(total*100)/500;
  if(per<30)
  System.out.print("Division\t:\t"+"Fail");
  if(per>=30&&per<45)
  System.out.print("Division\t:\t"+"Third");
  else if(per>=45&&per<60)
  System.out.print("Division\t:\t"+"Second");
  else
  System.out.print("Division\t:\t"+"First");

  }  
  
}
class MarkSheet 
{
 public static void main(String []argv)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String name,college;
  int rollNumber;
  int marks[]=new int[5];
  System.out.println("Enter the name of the student:-");
  name=br.readLine();
  System.out.println("Enter the college name:-");
  college=br.readLine();
  System.out.println("Enter the Roll Number of the student:-");
  rollNumber=Integer.parseInt(br.readLine());
  System.out.println("Enter the five subject marks");
  for(int i=0;i<5;i++)
  marks[i]=Integer.parseInt(br.readLine());  
  MSheet ob=new MSheet();
  ob.input(name,college,rollNumber,marks);
  ob.display();
 }
}