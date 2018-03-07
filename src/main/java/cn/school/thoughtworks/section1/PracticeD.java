//package cn.school.thoughtworks.section1;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//public class PracticeD {
//    List<String> collectSameElements(Map<String,String> collection1, Map<String,List<String>> collection2) {
//        List<String> list1 = new ArrayList<>();
//        for(Map.Entry<String, String> entry : collection1.entrySet()){
//            list1.add(entry.getValue());
//        }
//
//        List<String> list2 = collection2.get("value");
//        list1.retainAll(list2);
//
//        return list1;
//    }
//}
