import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setAttribute("username", "gamingUser");
        response.getWriter().println("Session created and attribute set.");
    }
}
