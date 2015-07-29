package JavaTraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java04Collection {
    private List<String> createList(){
        List<String> list = new ArrayList<String>();
        list.add("Big C");
        list.add("Lotus");
        list.add("Future Park");
        list.add("Pattaya");
        return list;
    }
    private Set<String> createSet(){
        Set<String> set = new HashSet<String>();
        set.add("Chonburi");
        set.add("BKK");
        set.add("Chonburi");
        return set;
    }
    private Map<String,String> createMap(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("KMITL","King Mongkut's Institute of Technology Ladkrabang");
        map.put("it","Information Technology");
        return map;
    }
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Java04Collection.class);
        Java04Collection java04Collection = new Java04Collection();
        List<String> list = java04Collection.createList();
        for(int i=0;i<list.size();i++){
            logger.info("list index : {} , value :{}",i,list.get(i));
        }

        Set<String> set = java04Collection.createSet();
        for(String string:set){
            logger.info("Set Value : {}",string);
        }
        Map<String,String> map = java04Collection.createMap();
        logger.info("Map key :it , value : {}",map.get("it"));
        for(String key : map.keySet()){
            logger.info("Map key :{} , value : {}",key,map.get(key));
        }
    }
}
