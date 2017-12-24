import java.sql.*;
class FirstJdbc
{
 public static void main(String []argv)
 {
   try
  {
   String driverName="com.mysql.jdbc.Driver";
   Class.forName(driverName);  
   String un="root";
   String up="tiger";
   String url="jdbc:mysql://localhost:3306/Mydatabase";
   Connection conn=DriverManager.getConnection(url,un,up);   
   Statement stmt=conn.createStatement();
   String query="select * from Movie";
   ResultSet rs=stmt.executeQuery(query);
   while(rs.next())
   {
    int id=rs.getInt(1);
    String name=rs.getString(2);
    String type=rs.getString(3);
    System.out.println(id+"\t"+name+"\t"+type);
   }
  }
  catch(Exception e)
  {
  System.out.println("Error"+e);
  }
 }
}
  