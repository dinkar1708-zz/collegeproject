import java.sql.*;
import java.io.*;
class UserInput
{
 public static void main(String []argv)throws IOException
 {
   try
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String driverName="com.mysql.jdbc.Driver";
   Class.forName(driverName);  
   String un="root";
   String up="tiger";
   String url="jdbc:mysql://localhost:3306/mydatabase";
   Connection conn=DriverManager.getConnection(url,un,up);   
   Statement stmt=conn.createStatement();
   System.out.println("Enter the table name");
   String tName=br.readLine();
   String query="create table "+tName+"(name varchar(10),id int)";
   stmt.executeUpdate(query);    
  }
  catch(Exception e)
  {
  System.out.println("Error"+e);
  }
 }
}
  