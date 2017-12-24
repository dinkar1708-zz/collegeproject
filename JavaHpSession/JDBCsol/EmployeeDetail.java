import java.sql.*;
class EmployeeDetail
{
 public static void main(String []argv)
 {
  try
  {
  Class.forName("com.mysql.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/Mydatabase";
  String name="root";
  String password="tiger";
  Connection conn=DriverManager.getConnection(url,name,password);
  Statement stmt=conn.createStatement();
  //String query="create table Employee2(EmpId int,Name varchar(20),DeptNo int,DeptName varchar(20))"; 
  //String q="insert into Employee1 values(1001,'ScottTiger',100101,'CSE')";  
  String count="delete from employee1 where EmpId=1001";
  int status=stmt.executeUpdate(count);
  System.out.println("Following row deleted"+status);
   if(status>0)
   {
    System.out.println("Data deleted Successfully");
   }
   else
   System.out.println("Data not deleted ");
  }
  catch(Exception e)
  {
   System.out.println("Error:- "+e.getMessage());
  }
 }
}
   