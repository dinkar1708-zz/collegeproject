import java.util.Scanner;
class Process
{
	String name;
	int mathMarks,phyMarks,chemMarks;
	Process(String n,int math,int phy,int chem)
	{
	 name=n;
	 mathMarks=math;
	 phyMarks=phy;
	 chemMarks=chem;
	 int allTotal=mathMarks+phyMarks+chemMarks;
	 int mpTotal=mathMarks+phyMarks;
	 if(mathMarks>=60&&phyMarks>=50&&chemMarks>=40&&allTotal>=200||mpTotal>=150)
	 System.out.println("Student is eligible");
	 else
         System.out.println("Student not eligible");
	}
}	
class Student
{
	public static void main(String [] argv)
	{
	 Scanner scanner=new Scanner(System.in);
	 String name;
	 int mathMarks, phyMarks,chemMarks;
	 System.out.println("Enter the name:-");
	 name=scanner.nextLine();
	 System.out.println("Enter the physics mark:-");
	 mathMarks=Integer.parseInt(scanner.nextLine());
	 System.out.println("Enter the math mark:-");
	 phyMarks=Integer.parseInt(scanner.nextLine());
	 System.out.println("Enter the physics mark:-");
	 phyMarks=Integer.parseInt(scanner.nextLine());
	 System.out.println("Enter the chemistry mark:-");
	 chemMarks=Integer.parseInt(scanner.nextLine());
	 new Process(name,mathMarks,phyMarks,chemMarks);
	}
}
	