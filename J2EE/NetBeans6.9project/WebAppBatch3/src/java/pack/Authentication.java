package pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DBService;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;



public class Authentication extends HttpServlet {
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     PrintWriter out = response.getWriter();
     String id = request.getParameter("user");
     String pass = request.getParameter("password");
String q = "select *from login where loginid='"+id+"' and password='"+pass+"'";
ResultSet rs = DBService.selectData(q);
     try{
     if(rs.next())
     {
      //VALID USER

     HttpSession sess = request.getSession();
     sess.setAttribute("lid",id);

     String role = rs.getString(3);
      if(role.equals("admin"))
      {
       //ADMIN
       out.print("HELLO ADMIN FROM AUTHENTICATION...");
       ServletConfig cfg = getServletConfig();
       String c = cfg.getInitParameter("contact");
       out.print("<br>ADMIN CONTACT : "+c);

        ServletContext ct = getServletContext();
        String cr = ct.getInitParameter("copyright");
       out.print("<br>COPYRIGHT &copy; TO : "+cr);

       RequestDispatcher rd = request.getRequestDispatcher("cp");
       rd.forward(request, response);
      }
      else
      {
       //USER
       response.sendRedirect("UserHome.html");
      }

     }
     else
     {
      //INVALID USER
         out.print("<font color=red size=12>");
         out.print("INVALID USER");
         out.print("</font>");
     }
        }catch(Exception e){
         out.print("ERROR : "+e.getMessage());
        }

    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
