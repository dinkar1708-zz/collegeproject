import java.sql.*;
import java.io.*;
class UserInput
{
 public static void main(String []argv)throws IOException
 {
  try
  {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Class.forName("com.mysql.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/Mydatabase";
  String name="root";
  String password="tiger";
  Connection conn=DriverManager.getConnection(url,name,password);
  Statement stmt=conn.createStatement();
  System.out.println("Enter the name of the table");
  String TName=br.readLine();
  String query="create table TName(EmpId int,Name varchar(20),DeptNo int,DeptName varchar(20))"; 
  }
  catch(Exception e)
  {
   System.out.println("Error:- "+e.getMessage());
  }
 }
}
   