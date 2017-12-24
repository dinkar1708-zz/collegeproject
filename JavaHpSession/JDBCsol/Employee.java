import java.sql.*;
class Employee
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
  String query="select*from Employee";
  ResultSet rs=stmt.executeQuery(query);
  System.out.println("__________________________________");
  System.out.println("|EmpId|\tName|\tDeptNo|\tDeptName|");
  System.out.println("----------------------------------");
  while(rs.next())
  {
    int EmpId=rs.getInt(1);
    String Name=rs.getString(2);	
    int DeptNo=rs.getInt(3);
    String DeptName=rs.getString(4);
    System.out.println("|"+EmpId+"|\t"+Name+"|\t"+DeptNo+"|\t"+DeptName+"|");
  }
  }
  catch(Exception e)
  {
   System.out.println("Error:- "+e.getMessage());
  }
 }
}
   