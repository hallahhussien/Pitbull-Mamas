package controller.Action;

import entity.Product;
import entity.User;
//import entity.UserProductLink;
import entity.FavoriteList;
import persistence.ProductDao;
//import persistence.UserProductDao;
import persistence.FavoriteListDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "AddFavorite",
        urlPatterns = { "/secure/addFavorite" }
)

public class AddFavorite extends HttpServlet {
    private ProductDao productDao = new ProductDao();
//    private UserProductDao libraryDao = new UserProductDao();
    private FavoriteListDao  favoriteListDao = new FavoriteListDao();
    private int productId;
    private User user;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        session.setAttribute("addFail", null);

        if (request.getParameter("ProductId") != null) {
            productId = Integer.parseInt(request.getParameter("ProductId"));

            String destination = request.getParameter("destination");

            switch (destination) {
                case "FavoriteList":
                    FavoriteList favoriteList = favoriteListDao.getLinkByUserProduct(user.getUserId(), productId);
                    if (favoriteList == null) {
                        checkLibrary(request, response, session, user);
                    } else {
                        session.setAttribute("addFail", "ERROR: Product " + productDao.getProduct(productId).getProductName() + " is already in FavoriteList.");
                        getServletContext().getRequestDispatcher("/searchProduct").forward(request, response);
                    }

                    getServletContext().getRequestDispatcher("/searchProduct").forward(request, response);
            }
        }
    }


    private void checkLibrary(HttpServletRequest request, HttpServletResponse response, HttpSession session, User user) throws ServletException, IOException {
        FavoriteList library = favoriteListDao.getLinkByUserProduct(user.getUserId(), productId);
        if (library != null) {
            session.setAttribute("addFail", "ERROR: Product " + productDao.getProduct(productId).getProductName() + " is already in Favorites.");
            getServletContext().getRequestDispatcher("/productSearch").forward(request, response);
        } else {
            favoriteListDao.addFavoriteListItem(createFavoriteListLink(productDao.getProduct(productId), user));
            response.sendRedirect("/favoritelist");
        }
    }

//    private void sendToLibrary() {
//        UserProductLink library = libraryDao.getLinkByUserProduct(user.getUuid(), movieID);
//        FavoriteList wishlist = wishlistDao.getLinkByUserProduct(user.getUuid(), movieID);
//
//        if (library == null && wishlist != null) {
//            //move from wishlist to library
//            wishlistDao.deleteWishListItem(wishlist.getIdwishlistlink());
//        }
//
//        libraryDao.addUserProduct(createLibraryLink(productDao.getProduct(movieID), user));
//    }

    public FavoriteList createFavoriteListLink(Product productId, User user) {
        FavoriteList listItem = new FavoriteList();
        listItem.setProductId(productId);
        listItem.setUserId(user);
        return listItem;
    }

}