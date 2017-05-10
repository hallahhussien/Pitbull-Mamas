package controller.Action;

import entity.Product;
import persistence.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 2/21/17.
 */
@WebServlet (
        urlPatterns = {"/pitbullmamas/yay"}
)
public class Yay extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        if (session.getAttribute("product") != null) {
            session.setAttribute("product", null);
        }


        ProductDao dao = new ProductDao();

        List<Product> products = new ArrayList<>();
        products = dao.getAllProducts();

        session.setAttribute("products", products);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/pitbullmamas/products");
        dispatcher.forward(req, resp);

    }
}