import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GamingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Gaming Setup</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to Gaming Setup Details</h1>");
        out.println("<p>Here, you can find the best PC setups for gaming enthusiasts!</p>");
        out.println("<p>Processor: Intel i9</p>");
        out.println("<p>GPU: Nvidia RTX 4090</p>");
        out.println("<p>RAM: 32GB DDR4</p>");
        out.println("<p>Storage: 1TB SSD</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
