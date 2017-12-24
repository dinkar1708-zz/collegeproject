import java.io.*;
class EmployeeDetail
{
	int empID1,deptID1;
	String empName1;
	int salary1;
	char bloodGroup1;
	public void setEmployeeDetails(int empID,String empName,int deptID,char bloodGroup,int salary)
	{
 		empID1=empID;
		deptID1=deptID;
		empName1=empName;		
		bloodGroup1=bloodGroup;	
		salary1=salary;
	}
	public void printEmployeeDetails( )
	{
	        System.out.println("The employee details are:-");
		System.out.println("EmployeeID="+empID1);
		System.out.println("EmpoyeeName="+empName1);
		System.out.println("DepartmentID="+deptID1);
		System.out.println("Salary="+salary1);
		System.out.println("BloodGroup="+bloodGroup1);
	}
}
public class Employee
{
	public static void main(String [] argv) throws IOException
	{
	int empID,deptID,salary;	
	String empName;
	char bloodGroup;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the salary:-\t");	 
	salary=Integer.parseInt(br.readLine());		 	
	System.out.println("Enter the employeeID:-\t");
	empID=Integer.parseInt(br.readLine());	 
	System.out.println("Enter the name:-\t");
	empName=br.readLine();	 
	System.out.println("Enter the departmentID:-\t");
	deptID=Integer.parseInt(br.readLine());	 
	System.out.println("Enter the bloodGroup:-\t");
	bloodGroup=(char)(br.read());
	EmployeeDetail ob=new EmployeeDetail();
	ob.setEmployeeDetails(empID,empName,deptID,bloodGroup,salary);
	ob.printEmployeeDetails();
	}
}
		  
 