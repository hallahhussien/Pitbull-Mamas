package edu.matc.persistence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2/1/17.
 */
public class ProductDaoTest {


    //User product;
    ProductDao productDao;

    @Before
    public void setup() {
        productDao = new ProductDao();
        //userDao.add(user);
    }
    @Test
    public void getProductOne() throws Exception {
        System.out.println(productDao.getProduct(1));

    }
    @Test
    public void getAllProducts() throws Exception {
        System.out.println(productDao.getAllProducts());
    }

    @Test
    public void getProductByName() throws Exception {
        System.out.println(productDao.getProductByName("Kong"));
    }

    @Test
    public void update() throws Exception {


    }

    @Test
    public void add() throws Exception {
        // userDao.add(user);
        assertEquals( 1, 1);
    }

    @Test
    public void delete() throws Exception {
     //   productDao.delete(3);

    }

}