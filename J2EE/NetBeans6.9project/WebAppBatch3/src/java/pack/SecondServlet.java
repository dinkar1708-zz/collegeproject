package pack;

import java.io.*;
import javax.servlet.*;

public class SecondServlet extends GenericServlet
{
    int count = 0;
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     PrintWriter out = res.getWriter();
     count++;
     out.print("<h1><font color=red>");
     out.print("Hit Count : "+count);
     out.print("<br>Hello From GenericServlet");
     out.print("</font></h1>");
     out.close();
    }

}
