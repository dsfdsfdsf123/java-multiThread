package TreeMap;

import java.util.*;

/**
 * @author liugang
 * @create 2018/12/7 15:58
 **/
public class test1 {

    public static void main(String[] args) {
        Map<String, Set<String>> dictionary = new TreeMap<>();
        Set<String> a = new TreeSet<>(Arrays.asList("Actual", "Arrival", "Actuary"));
        Set<String> b = new TreeSet<>(Arrays.asList("Bump", "Bravo", "Basic"));
        dictionary.put("B", b);
        dictionary.put("A", a);

        System.out.println(dictionary);
    }
}
