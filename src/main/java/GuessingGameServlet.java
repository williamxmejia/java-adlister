import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessingGame", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
//        RequestDispatcher view = request.getRequestDispatcher("/take-a-guess.jsp");
//        view.forward(request, response);
        request.getRequestDispatcher("/take-a-guess.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int random = (int) ((Math.random() * 3) + 1);
        int userGuess = Integer.parseInt(request.getParameter("guess"));
        if (random == userGuess){
            response.sendRedirect("/correct");
        }else{
            response.sendRedirect("/incorrect");
        }
    }
}
