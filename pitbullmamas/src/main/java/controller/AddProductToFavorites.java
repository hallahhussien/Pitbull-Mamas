//package controller;
//
//        import entity.Product;
//        import entity.User;
//        import entity.FavoriteList;
//
//
//        import javax.servlet.ServletException;
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import javax.servlet.http.HttpSession;
//        import java.io.IOException;
//
//@WebServlet(
//        urlPatterns = { "/addFavorite" }
//)
//
///**
// * Created by Student on 3/1/17.
// */
//public class AddProductToFavorites extends HttpServlet {
//
//    private int productId;
//
//    private User user;
//
//    public void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        HttpSession session = request.getSession();
//        user = (User) session.getAttribute("user");
//        session.setAttribute("addFail", null);
//
//        if (request.getParameter("productId") != null) {
//            productId = Integer.parseInt(request.getParameter("productId"));
//
//
//        public FavoriteList createFavoriteList (productId, user){
//            FavoriteList listItem = new FavoriteList();
//            listItem.setProductId(productId);
//            listItem.setUserId(user);
//            return listItem;
//        }
//        }
//    }
//
//
//}