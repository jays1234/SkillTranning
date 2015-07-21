package exceptiontraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 7/17/15.
 */
public class MyException extends  RuntimeException {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public MyException(){
        logger.info("MyException Error");
    }
}
