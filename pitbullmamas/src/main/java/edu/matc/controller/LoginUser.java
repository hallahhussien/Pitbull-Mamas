package edu.matc.controller;

import edu.matc.entity.UserBean;
import edu.matc.persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
        name = "userLogin",
        urlPatterns = { "/userLogin" }
)

/**
 * Servlet implementation class LoginServlet
 */
public class LoginUser extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try
        {

            UserBean user = new UserBean();
            user.setEmail(request.getParameter("em"));
            user.setPassword(request.getParameter("pw"));

            UserDao userDao = new UserDao();

            user = userDao.login(user);

            if (user.isValid())
            {

                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",user);
                response.sendRedirect("userLogged.jsp"); //logged-in page
            }

            else
              //  response.sendRedirect("invalidLogin.jsp"); //error page
            {
                System.out.println("invalid login");
            }
        }


        catch (Throwable theException)
        {
            System.out.println(theException);
        }
    }
}