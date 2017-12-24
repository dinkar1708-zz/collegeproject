/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author HPES
 */
public class MyFilter implements Filter {

   
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
	throws IOException, ServletException {

         String id = request.getParameter("id");

         if(id!=null)
         {
          chain.doFilter(request, response);
         }
        else
         {
            PrintWriter out = response.getWriter();
            out.print("INVALID REQUEST FOR SEND COOKIE : 'id' IS NOT THERE");
         }

	
    }
    
    
    public void destroy() { 
    }

    
    public void init(FilterConfig filterConfig) { 
	
	
    }

   
}
