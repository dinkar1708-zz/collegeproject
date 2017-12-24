package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    int cc = 0;
    int sc = 0;
    int rc = 0;
    public void contextInitialized(ServletContextEvent sce) {
    cc++;
    ServletContext ct = sce.getServletContext();
    ct.setAttribute("cc",cc);
    }

    public void contextDestroyed(ServletContextEvent sce) {
    cc--;
    ServletContext ct = sce.getServletContext();
    ct.setAttribute("cc",cc);
    }

    public void sessionCreated(HttpSessionEvent se) {
     sc++;
     HttpSession s = se.getSession();
     s.setAttribute("sc", sc);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
     sc--;
     HttpSession s = se.getSession();
     s.setAttribute("sc", sc);
    }

    public void requestDestroyed(ServletRequestEvent sre) {

    }

    public void requestInitialized(ServletRequestEvent sre) {
       rc++;
       ServletRequest r = sre.getServletRequest();
       r.setAttribute("rc",rc);
    }
}
