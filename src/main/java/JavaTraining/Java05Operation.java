package JavaTraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java05Operation {
    public static void main(String args[]){
        Logger logger = LoggerFactory.getLogger(Java05Operation.class);
        Integer i = 1;
        logger.info("i == 1:{}",i==1);
        logger.info("i != 1:{}",i!=1);
        logger.info("i < 1 :{}",i<1);
        logger.info("i > 1 :{}",i>1);
        logger.info("i <= 1:{}",i<=1);
        logger.info("i >= 1:{}",i>=1);
        logger.info("i(i=1) += 1:{}",i+=1);
        logger.info("i(i=2) -= 1:{}",i-=1);
        logger.info("i(i=1) *= 2:{}",i*=2);
        logger.info("i(i=2) /= 2:{},",i/=1);

    }
}
