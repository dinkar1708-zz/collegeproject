

package pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HPES
 */
public class AdminControlPanel extends HttpServlet {
   
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
       PrintWriter out = response.getWriter();
       HttpSession session = request.getSession(false);
       if(session!=null){
       String id = (String)session.getAttribute("lid");
       
       out.print("<hr>WELCOME ADMIN : "+id);
       out.print("<br>SESSION ID :  : "+session.getId());
       out.print("<br>CONTROL PANEL : WEB MANAGER PAGE...");

       ServletConfig cfg = getServletConfig();
       String c = cfg.getInitParameter("contact");
       out.print("<br>ADMIN CONTACT : "+c);

       ServletContext ct = getServletContext();
       String cr = ct.getInitParameter("copyright");
       out.print("<br>COPYRIGHT &copy; TO : "+cr);
       out.print("<hr>");
       out.print("<br>NUMBER OF CONTEXT INITIALIZE : "+ct.getAttribute("cc"));
       out.print("<br>NUMBER OF REQUEST ON APP. : "+request.getAttribute("rc"));
       out.print("<br>NUMBER OF CURRENT USERS : "+session.getAttribute("sc"));
       out.print("<hr>");
        out.print("<br><a href=logout >SIGN OUT</a>");
       }
       else
       {
         out.print("PLEASE LOGIN TO ACCESS THIS PAGE...");
         out.print("<br><a href=LoginPage.html>GO TO LOGIN PAGE</a>");
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
