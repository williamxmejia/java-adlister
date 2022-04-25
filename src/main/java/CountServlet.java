import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    int counter = 1;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("reset") != null){
            counter = 0;
            response.sendRedirect("/count");
        }
        response.getWriter().println("Page has been visited: " + counter++);
    }
}
