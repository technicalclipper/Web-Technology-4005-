import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class GetSessionByUrlServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sessionId = request.getParameter("id");
        
        if (sessionId != null) {
            HttpSession session = request.getSession(false);
            String username = (String) session.getAttribute("username");
            response.getWriter().println("Username from session: " + username);
        } else {
            response.getWriter().println("No session found");
        }
    }
}
