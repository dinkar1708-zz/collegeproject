import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddUniqeRow
{
  public static void main(String[] argv) throws Exception {

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase",
        "root", "tiger");

    Statement st = con.createStatement();
    int n = st.executeUpdate("ALTER TABLE student ADD UNIQUE(id)");
    System.out.println("Query OK, " + n + " rows affected.");
  }
}