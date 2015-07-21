package JavaTraining;

import model.DeclareAndAccess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java02DeclareAndAccess {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Java02DeclareAndAccess.class);
        DeclareAndAccess declareAndAccess = new DeclareAndAccess("defaultString");
        declareAndAccess.publicString="publicString";
        logger.info("publicString : {}",declareAndAccess.publicString);
        declareAndAccess.setPrivateString("privateString");
        logger.info("privateString : {}",declareAndAccess.getPrivateString());
        logger.info("defaultString(constructor) : {}",declareAndAccess.getDefaultString());
    }
}
