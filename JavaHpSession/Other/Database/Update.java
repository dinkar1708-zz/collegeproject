import java.sql.*;
import java.io.*;
class Update
{
 public static void main(String []argv) throws IOException
 {
  try
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   Class.forName("com.mysql.jdbc.Driver");
   String url="jdbc:mysql://localhost:3306/mydatabase";
   String un,up;
   System.out.println("Enter the user name of the database:-\t");
   un=br.readLine();
   System.out.println("Enter the user password of the database:-\t");
   up=br.readLine();   
   Connection conn=DriverManager.getConnection(url,un,up);
   Statement stmt=conn.createStatement();
   String query="update student set roll=27 where feeStructure=1200";
   int status=stmt.executeUpdate(query);
   if(status>0)
   System.out.println("Table updated.");
   else
   System.out.println("Not updated");
   conn.close();
  }
  catch(SQLException e)
  {
    System.out.println(e);
  }
  catch(ClassNotFoundException e1)
  {
    System.out.println(e1);
  }
 }
}
  