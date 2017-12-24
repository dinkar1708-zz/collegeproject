import java.sql.*;
import java.io.*;
class MySQL{
public static void main(String []args){
System.out.println("started");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDatabase","jay935","jay935");
String t1="jey";
int t2=4077;
Statement s=c.createStatement();
s.executeUpdate("create table Studento2(name varchar(20),rn int)");
s.close();
PreparedStatement ps=c.prepareStatement("insert into Studento2 values(?,?)");
ps.setString(1,t1);
ps.setInt(2,t2);
ps.executeUpdate();
ps.close();
ps=c.prepareStatement("select * from Studento2 where rn=?");
ps.setInt(1,t2);
ResultSet rs=ps.executeQuery();
while(rs.next()){
System.out.println("name="+rs.getString(1));
System.out.println("rn="+rs.getString(2));
}
}catch(SQLException e){System.out.println(e+"sql wali");}
catch(Exception e){System.out.println(e+"defalt wali");}
}}