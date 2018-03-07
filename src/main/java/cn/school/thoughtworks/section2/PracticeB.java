package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Set<String> collection1WithoutDuplicates = new HashSet<>(collection1);
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection1WithoutDuplicates) {
            Integer count = Collections.frequency(collection1, s);
            if(s.contains("-")){
                String[] splitedStr = s.split("-");
                s = splitedStr[0];
                count = Integer.valueOf(splitedStr[1]);
            }
            result.put(s, count);
        }
        return result;
    }
}
