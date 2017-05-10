package controller;


import entity.User;
import entity.FavoriteList;
import persistence.FavoriteListDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/favoriteList"}
)


public class FavoriteListDisplay extends HttpServlet {
    private FavoriteListDao favoriteListDao = new FavoriteListDao();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        List<FavoriteList> links = favoriteListDao.getFavoriteListByUserID(user.getUserId());

        session.setAttribute("products", links);

        getServletContext().getRequestDispatcher("favoreList.jsp").forward(request, response);

    }
}