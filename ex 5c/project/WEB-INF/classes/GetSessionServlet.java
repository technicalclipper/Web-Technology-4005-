import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class GetSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            response.getWriter().println("Username from session: " + username);
        } else {
            response.getWriter().println("No session found");
        }
    }
}
