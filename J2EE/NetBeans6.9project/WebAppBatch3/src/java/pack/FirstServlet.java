package pack;

import java.io.*;
import javax.servlet.*;
public class FirstServlet implements Servlet
{

    public void init(ServletConfig config) throws ServletException {
     
    }

    public ServletConfig getServletConfig() {
     return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.print("Hello From Server.");
        for(int i=0;i<10;i++){
        out.print("<br>Server Is Ready.");
        }
        out.close();
    }

    public String getServletInfo() {
     return "This is my First Servlet.";
    }

    public void destroy() {
        
    }

}
