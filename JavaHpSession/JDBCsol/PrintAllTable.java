import java.sql.*;
class PrintAllTable
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
  String count="show tables";
  ResultSet rs=stmt.executeQuery(count);
   while(rs.next())
   {
    System.out.println(rs.getString(1));
   }
  }
  catch(Exception e)
  {
   System.out.println("Error:- "+e.getMessage());
  }
 }
}
   