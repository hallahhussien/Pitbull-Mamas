package controller.Display;
import entity.Product;
import persistence.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        name = "Home",
        urlPatterns = { "/secure/home" }
)

public class Home  extends HttpServlet {
    private  ProductDao productDao = new ProductDao();
    private List<Product> featuredProducts;


    /**
     * doGet method for PitbullMamas home.jsp redirect
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("admin", request.isUserInRole("administrator"));
        List<Product> products = productDao.getAllProducts();
        featuredProducts = new ArrayList<>();


        if (!products.isEmpty()) {
            for (Product product: products
                    ) {
                productDao.getFeaturedProduct("yes");
            }

            session.setAttribute("featured" , featuredProducts );

        }

        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

//    private void addProductToList(Product product) {
//        if (product.getFeatured() {
//            featuredProducts.add(product);
//    }
//}
}