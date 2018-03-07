package cn.school.thoughtworks.section1;

import cn.school.thoughtworks.section2.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PracticeBTest {
    private PracticeB practiceB = null;

    @Before
    public void setUp() throws Exception {
        practiceB = new PracticeB();
    }

    @Test
    public void collect_same_elements_should_return_an_array_with_same_elements_in_two_collections() throws Exception {
        List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
        List<String> list = Arrays.asList("a", "d", "e", "f");
        List<List<String>> collection2 = Arrays.asList(list);

        List<String> result = practiceB.collectSameElements(collection1, collection2);
        List<String> expectedResult = Arrays.asList("a", "e", "f", "d");
        assertEquals(result, expectedResult);
    }
}