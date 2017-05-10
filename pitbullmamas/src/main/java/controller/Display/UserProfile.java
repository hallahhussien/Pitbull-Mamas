package controller.Display;

import entity.User;
import persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/userprofile"}
)
public class UserProfile extends HttpServlet {

        private UserDao dao = new UserDao();


        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            HttpSession session  = request.getSession();

            User me = (User)session.getAttribute("user");
            User user = dao.getUser(me.getUserId());

            if (user != null ) {
                session.setAttribute("user", user);
            }

            getServletContext().getRequestDispatcher("/secure/userprofile.jsp").forward(request, response);
        }
    }