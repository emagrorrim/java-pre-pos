package cn.school.thoughtworks.section2;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        transformOriginCollection(collection1);
        Set<String> collection1WithoutDuplicates = new HashSet<>(collection1);
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection1WithoutDuplicates) {
            Integer count = Collections.frequency(collection1, s);
            result.put(s, count);
        }

        return result;
    }

    private void transformOriginCollection(List<String> collection1) {
        List<String> specialElementList = collection1.stream().filter(e -> e.length() > 1).collect(Collectors.toList());
        Map<String, Integer> result = specialElementList.stream().collect(Collectors.toMap(this::getValue, this::countAmount));
        flatElementInList(result, collection1);
    }

    private void flatElementInList(Map<String, Integer> result, List<String> collection1) {
        for (Map.Entry set : result.entrySet()) {
            int count = (int) set.getValue();
            for (int i = 0; i < count; i++) {
                collection1.add((String) set.getKey());
            }
        }
    }

    private Integer countAmount(String s) {
        if (s.contains("-|:")) {
            return Integer.valueOf(s.split("-|:")[1]);
        }

        return Integer.parseInt(s.charAt(s.indexOf("[") + 1) + "");
    }

    private String getValue(String s) {
        if (s.contains("-|:")) {
            return s.split("-|:")[0];
        }

        return s.split("\\[")[0];
    }


}
