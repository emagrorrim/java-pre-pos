package cn.school.thoughtworks.section3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PracticeCTest {
    private PracticeC practiceC = null;

    @Before
    public void setUp() throws Exception {
        practiceC = new PracticeC();
    }

    @Test
    public void create_update_elements_should_return_an_array_with_same_elements_in_two_collections() throws Exception {
        //选出A集合中元素的key属性跟B对象中value属性中的元素相同的元素,把他们的count，满3减1，输出减过之后的新A集
        List<String> collection1 = Arrays.asList(
                "a", "a", "a",
                "e", "e", "e", "e", "e", "e", "e",
                "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h",
                "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t",
                "f", "f", "f", "f", "f", "f", "f", "f", "f",
                "c", "c", "c", "c", "c", "c", "c", "c",
                "g", "g", "g", "g", "g", "g", "g",
                "b", "b", "b", "b", "b", "b",
                "d", "d", "d", "d", "d"
        );

        List<String> list = Arrays.asList("a", "d", "e", "f");
        Map<String, List<String>> collection2 = new HashMap<>();
        collection2.put("value", list);

        Map<String, Integer> result = practiceC.createUpdatedCollection(collection1, collection2);
        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 2);
            put("e", 5);
            put("h", 11);
            put("t", 20);
            put("f", 6);
            put("c", 8);
            put("g", 7);
            put("b", 6);
            put("d", 4);
        }};

        assertEquals(result, expectedResult);
    }
}
