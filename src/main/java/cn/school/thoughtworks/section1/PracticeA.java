package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<>(collection1); //防止collection1被修改
        result.retainAll(collection2);
        return result;
    }
}
