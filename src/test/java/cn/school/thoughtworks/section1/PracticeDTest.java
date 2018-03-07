//package cn.school.thoughtworks.section1;
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
//public class PracticeDTest {
//    private PracticeD practiceD = null;
//
//    @Before
//    public void setUp() throws Exception {
//        practiceD = new PracticeD();
//    }
//
//    @Test
//    public void collect_same_elements_should_return_an_array_with_same_elements_in_two_collections() throws Exception {
//        //选出1集合中元素的key属性，跟2对象中value属性中的元素相同的元素
//        Map<String,String> collection1 = new HashMap<String,String>();
//            collection1.put("key","a");
//            collection1.put("key","e");
//            collection1.put("key","h");
//            collection1.put("key","t");
//            collection1.put("key","f");
//            collection1.put("key","c");
//            collection1.put("key","g");
//            collection1.put("key","b");
//
//        List<String> list = Arrays.asList("a", "d", "e", "f");
//        Map<String,List<String>> collection2 = new HashMap<>();
//        collection2.put("value",list);
//
//        List<String> result = practiceD.collectSameElements(collection1, collection2);
//        List<String> expectedResult = Arrays.asList("a", "e", "f", "d");
//        assertEquals(result, expectedResult);
//    }
//}
