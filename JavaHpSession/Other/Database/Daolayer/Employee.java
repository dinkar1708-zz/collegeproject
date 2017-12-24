import java.sql.*;
import java.io.*;
class Employee
{ 
 DBService ob=new DBService(); 
 public void showE()
 {
  try
  {
   String query="select*from Employee"; 	   
   ResultSet rs=ob.selectData(query);
   System.out.println("EmpId\tEmpName\t\tDeptNo\t\tDeptName");
   System.out.println("____________________________________________________");
   while(rs.next())
   {
    int Empid=rs.getInt(1);
    System.out.print(Empid+"\t");
    String name=rs.getString(2);
    System.out.print(name+"\t");
    int DeptNo=rs.getInt(3);
    System.out.print(DeptNo+"\t\t");
    String DeptName=rs.getString(4);
    System.out.println(DeptName+"\t");  
   } 
   System.out.println("____________________________________________________");
  }
  catch(Exception e)
  {System.out.println(e.getMessage());}
}
 public void updateE()
 {
   String query="update employee set Name='V.K.pallav' where DeptName='IT'";
   int status=ob.updateData(query);
   if(status>0)
   System.out.println("Table updated");
   else
   System.out.println("Table Not Updated");
 }
 public void deleteE()
 {
   String query=" delete from employee where name='ScottTiger'";
   int status=ob.updateData(query);
   if(status>0)
   System.out.println("Record deleted");
   else
   System.out.println("Record Not deleted");
 }
 public void insertE()
 {
  try
  {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the Employee ID:\t");
  int empId=Integer.parseInt(br.readLine());
  System.out.println("Enter the Employee Name:\t");
  String empName=br.readLine();
  System.out.println("Enter the Department number:\t");
  int deptNo=Integer.parseInt(br.readLine());
  System.out.println("Enter the Department Name:\t");
  String deptName=br.readLine();
  String q = "insert into employee values('"+empId+"','"+empName+"','"+deptNo+"','"+deptName+"')";
  DBService.updateData(q);

  }
  catch(Exception e)
  {System.out.println("Error:"+e.getMessage());}
 }  
}
  