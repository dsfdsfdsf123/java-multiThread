package nginx;

import java.util.*;

/**
 * 加权轮训
 * @author liugang
 * @create 2018/12/7 0:33
 **/
public class WeightRoundRobin {

    private static Integer pos;

    public static String getServer(){
        //重建一个Map，避开服务器的上下线导致的并发问题
        Map<String,Integer> serverMap = new HashMap<String,Integer>();
        serverMap.putAll(IpMap.serverWeightMap);
        //取得Ip地址List
        Set<String> keySet = serverMap.keySet();
        Iterator<String> iterator = keySet.iterator();

        List<String> serverList = new ArrayList<>();
        while (iterator.hasNext()){
            String server =iterator.next();
            int weight = serverMap.get(server);
            for (int i=0;i<weight;i++){
                serverList.add(server);
            }
        }
        String server = null;
        synchronized (pos){
            if (pos>keySet.size()){
                pos = 0;
            }
            server = serverList.get(pos);
            pos++;
        }
    }
}
