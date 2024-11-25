import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ProcessFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        response.getWriter().println("Username from hidden field: " + username);
    }
}
