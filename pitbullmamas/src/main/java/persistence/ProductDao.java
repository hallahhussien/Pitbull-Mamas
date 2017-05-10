package persistence;

import entity.Product;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Student on 3/20/17.
 */
public class ProductDao {

    private final Logger logger = Logger.getLogger(this.getClass());

    public List<Product> getAllProducts() {
        List<Product> products = null;
        Session session = null;
        try {
            session = openSession();
            products = session.createCriteria(Product.class).list();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getAllProduct(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getAllProduct(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return products;
    }


    public Product getProduct(int id) {
        Product product = null;
        Session session = null;
        try {
            session = openSession();
            product = (Product) session.get(Product.class, id);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getProductById(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getProductById(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    public Product getProductByName(String productName) {
        Product product = null;
        Session session = null;
        try {
            session = openSession();
            product = (Product) session.get(Product.class, productName);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getProductByName(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getProductByName(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    public Product getProductByType(String productType) {
        Product product = null;
        Session session = null;
        try {
            session = openSession();
            product = (Product) session.get(Product.class, productType);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getProductByType(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getProductByType(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    public Product getFeaturedProduct(String featured) {
        Product product = null;
        Session session = null;

        try {
            session = openSession();
            product = (Product) session.get(Product.class, featured);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getFeaturedProduct(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getFeaturedProduct(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }


    public int addProduct(Product product) {
        int id = 0;
        Session session = null;
        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(product);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in addProduct(): " + he);
        } catch (Exception e) {
            logger.error("Exception in addProduct(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        logger.info("returned id: " + id);
        return id;

    }

    public int addNewProduct(String productName, String productDescription, String productType, String productLink, String productPrice, String featured, byte[] image) {
        int id = 0;
        Session session = null;
        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            Product product = new Product();
               product.setProductName(productName);
               product.setProductType(productType);
               product.setProductDescription(productDescription);
               product.setProductLink(productLink);
               product.setProductPrice(productPrice);
               product.setFeatured(featured);
               product.setImage(image);


            id = (int) session.save(product);
            transaction.commit();
            logger.info(transaction);
            logger.info("We got here !!" + product);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception: " + he);
        } catch (Exception e) {
            logger.error("Exception addRegiteredUser: " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }

    public void deleteProduct(int productId) {
        Session session = null;

        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            Product product = (Product) session.get(Product.class, productId);
            session.delete(product);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in deleteProduct(): " + he);
        } catch (Exception e) {
            logger.error("Exception in deleteProduct(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


    private Session openSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }


}