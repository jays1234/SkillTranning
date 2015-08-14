package Trainee.JavaTraining;

import Trainee.exceptiontraining.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java03Exception {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Java03Exception.class);
        try {
            if (true) {
                throw new MyException();
            }
        }catch (MyException e){
            logger.info("catch MyException");
        }
    }
}
