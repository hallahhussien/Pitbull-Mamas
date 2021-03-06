package controller;

import persistence.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author Student
 */

@WebServlet(
        urlPatterns = {"/searchProduct"}
)

public class SearchProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductDao productDao = new ProductDao();
        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("products", productDao.getProductByName(req.getParameter("searchTerm")));
        } else {
            req.setAttribute("users", productDao.getAllProducts());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchResults.jsp");
        dispatcher.forward(req, resp);
    }
}