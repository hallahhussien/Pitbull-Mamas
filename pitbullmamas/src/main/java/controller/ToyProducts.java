package controller;

import org.apache.log4j.Logger;
import persistence.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/toys"}
)
public class ToyProducts extends HttpServlet {

    private Logger logger = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        ProductDao dao = new ProductDao();
        logger.info(dao);
        dao.getProductByType("toy");
        logger.info( dao.getProductByType("toy"));
        session.setAttribute("toy", dao.getProductByType("toy"));

        String url = "/toys.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}