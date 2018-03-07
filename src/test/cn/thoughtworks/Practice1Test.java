package cn.thoughtworks;

import org.junit.Test;
import org.junit.Before;
import org.hamcrest.core.IsEqual;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Practice1Test {
    Practice1 practice1 = null;

    @Before
    public void beforeEach() {
        practice1 = new Practice1();
    }

    @Test
    public void collect_same_elements_should_return_an_array_with_same_elements_in_two_collections() {
        List<String> collection1 = new ArrayList<>();
        List<String> collection2 = new ArrayList<>();

        List<String> result = practice1.collectSameElements(collection1, collection2);
        String[] expectedResult = new String[] {"a", "e", "f", "d"};
        assertArrayEquals(result.toArray(), expectedResult);
    }
}