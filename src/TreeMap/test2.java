package TreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author liugang
 * @create 2018/12/7 16:05
 **/
public class test2 {

    public static void main(String[] args) {
        TreeMap<Integer,String> tmap = new TreeMap<Integer, String>();
        tmap.put(1, "语文");
        tmap.put(3, "英语");
        tmap.put(2, "数学");
        tmap.put(4, "政治");
        tmap.put(5, "历史");
        tmap.put(6, "地理");
        tmap.put(7, "生物");
        tmap.put(8, "化学");
        for (Map.Entry<Integer,String> entry : tmap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
