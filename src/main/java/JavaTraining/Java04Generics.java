package JavaTraining;

import model.Box;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java04Generics {
    public static  void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Java04Generics.class);
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(1);
        logger.info("integerBox : {}",integerBox.getData().toString());
        Box<String> stringBox = new Box<String>();
        stringBox.add("aa");
        logger.info("stringBox : {}", stringBox.getData());

    }
}
