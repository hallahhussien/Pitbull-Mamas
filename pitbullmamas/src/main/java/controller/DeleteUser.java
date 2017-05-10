package controller;

import org.apache.log4j.Logger;
import persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Student on 4/27/17.
 */
@WebServlet("/deleteUser")
public class DeleteUser extends HttpServlet {

    private final Logger logger = Logger.getLogger(DeleteUser.class);


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int userId = Integer.parseInt(request.getParameter("userId"));

        logger.info("Deleting " + userId );

        UserDao dao = new UserDao();

        logger.info("attempting to delete user");
        dao.deleteUser(userId);


        response.sendRedirect("/success");

    }
}