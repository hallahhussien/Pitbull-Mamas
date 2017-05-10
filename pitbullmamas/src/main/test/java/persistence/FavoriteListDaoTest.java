//package persistence;
//
//import entity.FavoriteList;
//import entity.Product;
//import entity.User;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.time.LocalDate;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
///**
// * Created by Mike on 2/15/17.
// */
//public class FavoriteListDaoTest {
//
//
//    User hallah;
//    User harold;
//    UserDao userDao;
//
//    Product bone;
//    Product ball;
//    ProductDao productDao;
//
//    FavoriteList link;
//    FavoriteListDao dao;
//
//
//    int newUser1 = 0;
//    int newUser2 = 0;
//
//    int newProduct1 = 0;
//    int newProduct2 = 0;
//
//    int link = 0;
//
//    @Before
//    public void setUp() throws Exception {
//        //prep address table first, or user insert will fail on constraint
//
//        userDao = new UserDao();
//        hallah = new User();
//
//        hallah.setFirstName("hallah");
//        hallah.setLastName("hussien");
//        hallah.setUserName("hallah");
//        hallah.setUserPassword("1234");
//        hallah.setLocation("Here");
//        hallah.setPuppyName("Pea");
//        newUser1 = userDao.addUser(hallah);
//
//        harold = new User();
//        harold.setFirstName("harold");
//        harold.setLastName("russell");
//        harold.setUserName("harold");
//        harold.setUserPassword("1234");
//        harold.setLocation("Here");
//        hallah.setPuppyName("Huey");
//        newUser2 = userDao.addUser(harold);
//
//        File file = new File("/webapp/images/treats.jpg");
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
//        productDao = new ProductDao();
//        bone = new Product();
//        bone.setProductId(104);
//        bone.setProductName("Bone");
//        bone.setProductDescription("Better than getting your shoes chewed!");
//        bone.setProductType("food");
//        bone.setProductLink("www.test.org");
//        bone.setProductPrice("12");
//        bone.setFeatured("Yes");
//        bone.setImage(bFile);
//        newProduct1 = productDao.addNewProduct(bone);
//
//        film2 = new Movie();
//        film2.setTitle("Jaws");
//        film2.setReleaseDate(LocalDate.of(2005,9,22));
//        film2.setFormat(form);
//        film2.setGenre(gen);
//        film2.setStudio(std);
//        film2.setDirector(dir);
//        film2.setImdbid("abcidkasb");
//        film2.setUpccode("999999999999");
//        newMovie2 = movieDao.addMovie(film2);
//
//        dao = new WishlistDao();
//        link = new Wishlist();
//        link.setUserid(hallah);
//        link.setMovieid(film1);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        if (newWishList != 0) {
//            dao.deleteWishListItem(newWishList);
//        }
//
//        if (newUser2 != 0) {
//            userDao.deleteUser(newUser2);
//        }
//
//        if (newUser1 != 0) {
//            userDao.deleteUser(newUser1);
//        }
//
//
//        if (newMail != 0) {
//            mailDao.deleteAddress(newMail);
//        }
//
//        if (newMovie2 != 0) {
//            movieDao.deleteMovie(newMovie2);
//        }
//
//        if (newMovie1 != 0) {
//            movieDao.deleteMovie(newMovie1);
//        }
//
//        if (newStudio != 0) {
//            stdDao.deleteStudio(newStudio);
//        }
//
//        if (newForm != 0) {
//            formDao.deleteFormat(newForm);
//        }
//
//        if (newGen != 0) {
//            genDao.deleteGenre(newGen);
//        }
//
//        if (newDir != 0) {
//            dirDao.deleteDirector(newDir);
//        }
//    }
//
//    @Test
//    public void getAllWishListItems() throws Exception {
//        newWishList = dao.addWishListItem(link);
//        List<Wishlist> wishlistItems = dao.getAllWishListItems();
//        assertTrue("no wishlist items returned", wishlistItems.size() > 0);
//    }
//
//    @Test
//    public void getWishListItem() throws Exception {
//        newWishList = dao.addWishListItem(link);
//        assertEquals("wishlist id not returned", link.getIdwishlistlink(), dao.getWishListItem(newWishList).getIdwishlistlink());
//        assertEquals("wishlist movie not returned", link.getMovieid().getIdmovie(), dao.getWishListItem(newWishList).getMovieid().getIdmovie());
//        assertEquals("wishlist owner not returned", link.getUserid().getUuid(), dao.getWishListItem(newWishList).getUserid().getUuid());
//    }
//
//    @Test
//    public void addWishListItem() throws Exception {
//        newWishList = dao.addWishListItem(link);
//        assertEquals("wishlist id not inserted", link.getIdwishlistlink(), dao.getWishListItem(newWishList).getIdwishlistlink());
//        assertEquals("wishlist movie not inserted", link.getMovieid().getIdmovie(), dao.getWishListItem(newWishList).getMovieid().getIdmovie());
//        assertEquals("wishlist owner not inserted", link.getUserid().getUuid(), dao.getWishListItem(newWishList).getUserid().getUuid());
//    }
//
//    @Test
//    public void deleteWishListItem() throws Exception {
//        dao.addWishListItem(link);
//        dao.deleteWishListItem(link.getIdwishlistlink());
//        assertNull("wishlist link not deleted", dao.getWishListItem(link.getIdwishlistlink()));
//    }
//
//    @Test
//    public void updateWishListItem() throws Exception {
//        newWishList = dao.addWishListItem(link);
//
//        assertEquals("wishlist id not inserted", link.getIdwishlistlink(), dao.getWishListItem(newWishList).getIdwishlistlink());
//        assertEquals("wishlist movie not inserted", link.getMovieid().getIdmovie(), dao.getWishListItem(newWishList).getMovieid().getIdmovie());
//        assertEquals("wishlist owner not inserted", link.getUserid().getUuid(), dao.getWishListItem(newWishList).getUserid().getUuid());
//
//        link.setUserid(harold);
//        link.setMovieid(film2);
//
//        dao.updateWishListItem(link);
//
//        assertEquals("wishlist id not updated", link.getIdwishlistlink(), dao.getWishListItem(newWishList).getIdwishlistlink());
//        assertEquals("wishlist movie not updated", link.getMovieid().getIdmovie(), dao.getWishListItem(newWishList).getMovieid().getIdmovie());
//        assertEquals("wishlist owner not updated", link.getUserid().getUuid(), dao.getWishListItem(newWishList).getUserid().getUuid());
//
//    }
//
//    @Test
//    public void getWishListByUserID() throws Exception {
//        newWishList = dao.addWishListItem(link);
//        assertNotNull("no movie returned for user in link", dao.getWishListByUserID(link.getUserid().getUuid()));
//        assertNotNull("no movie link returned for user", dao.getWishListByUserID(hallah.getUuid()));
//        assertEquals("link count returned different than expected", 1, dao.getWishListByUserID(link.getUserid().getUuid()).size());
//    }
//
//    @Test
//    public void getLinkByUserMovie() throws Exception {
//        newWishList = dao.addWishListItem(link);
//        assertNotNull("no links returned", dao.getLinkByUserMovie(link.getUserid().getUuid(), link.getMovieid().getIdmovie()));
//    }
//}