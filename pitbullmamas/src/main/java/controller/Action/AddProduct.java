package controller.Action;

import org.apache.log4j.Logger;
import persistence.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Student on 2/20/17.
 */

@WebServlet (
        urlPatterns = {"/secure/admin/addProduct"}
)
public class AddProduct extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/secure/admin/addProduct.jsp");
        dispatcher.forward(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String filepath = req.getParameter("addImage");
        File file = new File("filepath");

        byte[] bFile = new byte[(int) file.length()];


        try {

            FileInputStream fileInputStream = new FileInputStream(file);

            fileInputStream.read(bFile);

            fileInputStream.close();

        } catch (Exception e)

    {

        e.printStackTrace();
    }


        String productName = req.getParameter("addProductName");
        String productType = req.getParameter("addProductType");
        String productDescription = req.getParameter("addProductDescription");
        String productLink = req.getParameter("addProductLink");
        String productPrice = req.getParameter("addProductPrice");
        String featured = req.getParameter("isFeatured");
        byte[] image = bFile;


        try {
            ProductDao dao = new ProductDao();
            dao.addNewProduct(productName, productType,  productDescription, productLink, productPrice, featured, image);
            logger.info("The dao is working" + dao);
            logger.debug(dao.addNewProduct(productName, productType,  productDescription, productLink, productPrice, featured, image));
            resp.sendRedirect("/pitbullmamas/yay");
        } catch (Exception e) {
            logger.error("Exception: " + e);
        }

    }
}