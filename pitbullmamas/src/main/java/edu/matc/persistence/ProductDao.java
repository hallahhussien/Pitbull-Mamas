
package edu.matc.persistence;

        import edu.matc.entity.Product;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulawaite on 2/2/16.
 */
public class ProductDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /** Return a list of all products
     *
     * @return All products
     */
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<Product>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        products = session.createCriteria(Product.class).list();
        return products;
    }

    /** Get a single products for the given id
     *
     * @param productId products's id
     * @return Product
     */
    public Product getProduct(int productId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Product product = (Product) session.get(Product.class, productId);
        return product;
    }

    /** Retrieve products by name
     *
     * @param productName products's  name which is the search criteria
     * @return Product
     */
    public List<Product> getProductByName(String productName) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Product.class);
        criteria.add(Restrictions.eq("productName", productName));
        return criteria.list();
    }

    /** save or update product
     * @param product
     * @return productId of the inserted product
     */

    public int update(Product product) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int productId = (int)session.save(product);
        transaction.commit();
        return productId;
    }

    public int add(Product product) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        session.beginTransaction();

        //Add new product object
        product.getProductId();
        product.getProductName();
        product.getProductDescription();
        product.getProductLink();
        product.getProductPrice();
        product.getFeatured();
        product.getFavorited();
        product.getImage();

        //Save the employee in database
        session.save(product);

        //Commit the transaction
        session.getTransaction().commit();

        return product.getProductId();

    }

    public void delete(int productId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Product product = (Product) session.get(Product.class, productId);
        session.delete(product);
        session.flush();
    }

}