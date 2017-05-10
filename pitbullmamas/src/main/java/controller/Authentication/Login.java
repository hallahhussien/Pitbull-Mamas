package controller.Authentication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "Login",
        urlPatterns = { "/login" }
)


public class Login extends HttpServlet {

    /**
     * doGET method, handles GET request at /login url pattern, redirects to /login.jsp
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session  = request.getSession();

        if(request.getParameter("status").equals("fail")) {
            session.setAttribute("status", "Username and Password did not match records.");
        }

        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);

    }
}