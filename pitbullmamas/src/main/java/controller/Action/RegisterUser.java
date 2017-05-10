package controller.Action;

import persistence.UserDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Student on 2/20/17.
 */

@WebServlet (
        urlPatterns = {"/register"}
)
public class RegisterUser extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
        dispatcher.forward(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String firstName = req.getParameter("registerFirstName");
        String lastName = req.getParameter("registerLastName");
        String userName = req.getParameter("registerUsername");
        String userPassword = req.getParameter("registerPassword");
        String location = req.getParameter("registerLocation");
        String puppyName = req.getParameter("registerPuppyName");

        try {
            UserDao dao = new UserDao();
            dao.addRegisteredUser(firstName, lastName, userName, userPassword, location, puppyName);
            logger.info("The dao is working" + dao);
            logger.debug(dao.addRegisteredUser(firstName, lastName, userName, userPassword, location, puppyName));
            resp.sendRedirect("/pitbullmamas/success");
        } catch (Exception e) {
            logger.error("Exception: " + e);
        }

    }
}