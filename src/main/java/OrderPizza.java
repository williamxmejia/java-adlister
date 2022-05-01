import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "OrderPizzaServlet", urlPatterns = "/OrderPizza")
public class OrderPizza extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String[] toppings = req.getParameterValues("toppings");

        System.out.println(req.getParameterValues("toppings"));


        req.setAttribute("crust", crust);
        req.setAttribute("sauce", sauce);
        req.setAttribute("toppings", toppings);

        req.getRequestDispatcher("/order-pizza.jsp").forward(req, resp);
    }

}
