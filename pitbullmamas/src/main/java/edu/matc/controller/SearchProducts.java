package edu.matc.controller;

import edu.matc.persistence.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the product.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchProduct"}
)

public class SearchProducts extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductDao productData = new ProductDao();

        String searchTerm = req.getParameter("searchTerm");
        req.setAttribute("products", productData.getProductByName(searchTerm));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}