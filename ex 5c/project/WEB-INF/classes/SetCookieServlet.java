import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie userCookie = new Cookie("username", "gamingUser");
        userCookie.setMaxAge(60 * 60); // Expires in 1 hour
        response.addCookie(userCookie);
        
        response.getWriter().println("Cookie set successfully!");
    }
}
