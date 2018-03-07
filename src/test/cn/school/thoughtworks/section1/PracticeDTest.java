package cn.school.thoughtworks.section1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PracticeDTest {
    private PracticeD practiceD = null;

    @Before
    public void setUp() throws Exception {
        practiceD = new PracticeD();
    }

    @Test
    public void collect_same_elements_should_return_an_array_with_same_elements_in_two_collections() throws Exception {
        Map<String,String> collection1 = new HashMap<String,String>(){{
            put("key","a");
            put("key","e");
            put("key","h");
            put("key","t");
            put("key","f");
            put("key","c");
            put("key","g");
            put("key","b");
        }};

        List<String> list = Arrays.asList("a", "d", "e", "f");
        Map<String,List<String>> collection2 = new HashMap<>();
        collection2.put("value",list);

        List<String> result = practiceD.collectSameElements(collection1, collection2);
        List<String> expectedResult = Arrays.asList("a", "e", "f", "d");
        assertEquals(result, expectedResult);
    }
}
