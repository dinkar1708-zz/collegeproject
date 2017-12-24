import java.sql.*;
public class DBService
{
 public static Connection con;
 static
 {
   try {
   Class.forName("com.mysql.jdbc.Driver");
   String url = "jdbc:mysql://localhost:3306/mydatabase";
   String user = "root";
   String pass = "tiger";
   con = DriverManager.getConnection(url,user,pass);
   }
   catch(Exception e)
   {
    System.err.println("Error : "+e.getMessage());
   }
 }
 
 //A Service to Perform Update Operation on DB
 public static int updateData(String sqlQuery)
 {
  try{
  Statement st = con.createStatement();
  int ur = st.executeUpdate(sqlQuery);
  return ur; 
  }
  catch(Exception e)
  {
    System.err.println("Error : "+e.getMessage());
    return 0;
  }
 }

 //A Service to Perform Select Operation on DB
 public static ResultSet selectData(String sqlQuery)
 {
  try{
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery(sqlQuery);
  return rs; 
  }
  catch(Exception e)
  {
    System.err.println("Error : "+e.getMessage());
    return null;
  }
 }
}