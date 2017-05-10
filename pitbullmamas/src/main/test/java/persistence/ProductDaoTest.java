//package persistence;
//
//import entity.Product;
//import org.apache.log4j.Logger;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
///**
// * Created by Student on 2/13/17.
// */
//public class ProductDaoTest {
//
//    private final Logger logger = Logger.getLogger(this.getClass());
//    ProductDao dao;
//    Product bone;
//
//    int newProduct = 0;
//
//    @Before
//    public void setUp() throws Exception {
//        File file = new File("../main/webapp/images/treats.jpg");
//
//        byte[] bFile = new byte[(int) file.length()];
//
//
//        try {
//
//            FileInputStream fileInputStream = new FileInputStream(file);
//
//            fileInputStream.read(bFile);
//
//            fileInputStream.close();
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//
//        dao = new ProductDao();
//        bone = new Product();
//        bone.setProductId(16);
//        bone.setProductName("bone");
//        bone.setProductDescription("Better than getting your shoes chewed!");
//        bone.setProductType("food");
//        bone.setProductLink("www.test.org");
//        bone.setProductPrice("12");
//        bone.setFeatured("");
//        bone.setImage(bFile);
//
//
//
//
//    }
//
//    @Test
//    public void getAllProducts() throws Exception {
//        newProduct = dao.addProduct(bone);
//        List<Product> products = dao.getAllProducts();
//        assertTrue(products.size() > 0);
//    }
//
//    @Test
//    public void getProduct() throws Exception {
//        newProduct = dao.addProduct(bone);
//        assertNotNull("no product returned", dao.getProduct(newProduct));
//        logger.info("product is: " + dao.getProduct(newProduct));
//        assertEquals("product Id not returned correctly", bone.getProductId(), dao.getProduct(newProduct).getProductId());
//        assertEquals("Product Name not returned correctly", bone.getProductName(), dao.getProduct(newProduct).getProductName());
//        assertEquals("Product Description not returned correctly", bone.getProductDescription(), dao.getProduct(newProduct).getProductDescription());
//        assertEquals("Product Type is not returned correctly", bone.getProductType(), dao.getProduct(newProduct).getProductType());
//        assertEquals("Product Link returned correctly", bone.getProductLink(), dao.getProduct(newProduct).getProductLink());
//        assertEquals("Product Price not returned correctly", bone.getProductPrice(), dao.getProduct(newProduct).getProductPrice());
//        assertEquals("Featured was not returned correctly", bone.getFeatured(), dao.getProduct(newProduct).getFeatured());
//        assertEquals("Image was not returned correctly", bone.getImage(), dao.getProduct(newProduct).getImage());
//
//
//    }
//
//
//
//    @Test
//    public void getProductByType() throws Exception {
//        List<Product> product = new ArrayList<Product>();
//        assertEquals("toy", "toy");
//    }
//
//
//    @Test
//    public void addProduct() throws Exception {
//        newProduct = dao.addProduct(bone);
//        assertNotEquals("no product added", 0, newProduct);
//        assertEquals("product Id not returned correctly", bone.getProductId(), dao.getProduct(newProduct).getProductId());
//        assertEquals("Product Name not returned correctly", bone.getProductName(), dao.getProduct(newProduct).getProductName());
//        assertEquals("Product Description not returned correctly", bone.getProductDescription(), dao.getProduct(newProduct).getProductDescription());
//        assertEquals("Product Type is not returned correctly", bone.getProductType(), dao.getProduct(newProduct).getProductType());
//        assertEquals("Product Link returned correctly", bone.getProductLink(), dao.getProduct(newProduct).getProductLink());
//        assertEquals("Product Price not returned correctly", bone.getProductPrice(), dao.getProduct(newProduct).getProductPrice());
//        assertEquals("Featured was not returned correctly", bone.getFeatured(), dao.getProduct(newProduct).getFeatured());
//        assertEquals("Image was not returned correctly", bone.getImage(), dao.getProduct(newProduct).getImage());
//
//    }
//
//
////    @Test
////    public void deletedProduct() throws Exception {
////        dao.addProduct(bone);
////        dao.deleteProduct(bone.getProductId());
////        assertNull("Product not deleted", dao.getProduct(bone.getProductId()));
////    }
//
////
////    @After
////    public void cleanup() {
////        // clean up temp product for tests
////        if (newProduct != 0) {
////            dao.deleteProduct(newProduct);
////        }
////    }
//
//
//}