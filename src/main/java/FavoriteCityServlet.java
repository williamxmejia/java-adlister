import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/favCity")
public class FavoriteCityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String html = "<h1>Favorite City</h1> \n <form action=\"\" method=\"POST\">\n" +
                "    <label for=\"city\">City</label>\n" +
                "    <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Enter favorite city\">\n" +
                "<button>Submit</button>";

        response.getWriter().println(html);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/favCity/result?city=" + request.getParameter("city"));
    }
}
