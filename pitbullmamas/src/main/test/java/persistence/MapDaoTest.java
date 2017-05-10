//package persistence;
//
//import entity.Maps;
//import org.apache.log4j.Logger;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.List;
//
//import static org.junit.Assert.assertTrue;
//
///**
// * Created by Student on 2/13/17.
// */
//public class MapDaoTest {
//
//    private final Logger logger = Logger.getLogger(this.getClass());
//
//    MapsDao dao;
//    Maps shelter;
//
//    int newShelter = 0;
//
//    @Before
//    public void setUp() throws Exception {
//        dao = new MapsDao();
//        shelter = new Maps();
//
//        shelter.setLatitude("0.515546");
//        shelter.setLongitude("5656.2215");
//        shelter.setShelterName("shelter");
//        shelter.setShelterLink("www.test.com");
//    }
//
//    @Test
//    public void getAllMaps() throws Exception {
//        newShelter = dao.addMaps(shelter);
//        List<Maps> Maps = dao.getAllMaps();
//        assertTrue(Maps.size() > 0);
//
//        logger.info("Shelter Id is:"+ shelter.getShelterId());
//    }
//}