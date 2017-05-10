package controller.Display;


import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "Index",
        urlPatterns = { "/index" }
)


public class Index extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());

    /**
     * doGet method for pitbull mama's index.jsp redirect
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info(request.getRemoteAddr());
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }
}