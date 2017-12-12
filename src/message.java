/**
 * Created by e-user on 20.11.17.
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class message extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        System.out.println("--"+request.getParameter("a"));
    }
}