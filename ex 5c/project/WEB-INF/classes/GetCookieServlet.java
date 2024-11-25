import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class GetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String username = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    username = cookie.getValue();
                    break;
                }
            }
        }
        
        if (username != null) {
            response.getWriter().println("Username from cookie: " + username);
        } else {
            response.getWriter().println("No cookie found");
        }
    }
}
