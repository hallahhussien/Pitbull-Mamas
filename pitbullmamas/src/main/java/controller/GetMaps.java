package controller;

import org.apache.log4j.Logger;
import persistence.MapsDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/Maps"}
)
public class GetMaps extends HttpServlet {

    private Logger logger = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        MapsDao dao = new MapsDao();
        logger.info(dao);
        dao.getAllMaps();
        logger.info(dao.getAllMaps());
        session.setAttribute("Maps", dao.getAllMaps());

        String url = "/Maps.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}