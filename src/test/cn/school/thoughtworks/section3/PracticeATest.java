//package cn.school.thoughtworks.section3;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import static org.junit.Assert.assertEquals;
//
//public class PracticeATest {
//    private PracticeA practiceA = null;
//
//    @Before
//    public void setUp() throws Exception {
//        practiceA = new PracticeA();
//    }
//
//    @Test
//    public void collect_same_elements_should_return_an_array_with_same_elements_in_two_collections() throws Exception {
//        Map<String,String> collection1 = new HashMap<String,String>(){{
//            put("key","a");
//            put("key","e");
//            put("key","h");
//            put("key","t");
//            put("key","f");
//            put("key","c");
//            put("key","g");
//            put("key","b");
//            put("key","d");
//        }};
//
//        List<String> list = Arrays.asList("a", "d", "e", "f");
//        Map<String,List<String>> collection2 = new HashMap<>();
//        collection2.put("value",list);
//
//        List<String> result = practiceA.createUpdatedCollection(collection1, collection2);
//        List<String> expectedResult = Arrays.asList("a", "e", "f", "d");
//        assertEquals(result, expectedResult);
//    }
//}
