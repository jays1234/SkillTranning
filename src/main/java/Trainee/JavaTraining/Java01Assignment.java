package Trainee.JavaTraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java01Assignment {
    public static void main(String[] arg){
        Logger logger =  LoggerFactory.getLogger(Java01Assignment.class);
        //int i=null;//Error premitive is cannot null
        //Integer i; // Error not have been initialized
        Integer i = new Integer(0);// = Interger i =0;
        logger.info("i = {}",i);
        Map<Integer,String> stringMap = new HashMap<>();
        logger.info("{}",stringMap.get(0));
    }
}
