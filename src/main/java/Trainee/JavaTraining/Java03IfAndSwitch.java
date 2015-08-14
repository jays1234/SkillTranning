package Trainee.JavaTraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java03IfAndSwitch {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Java03IfAndSwitch.class);
       /** if(true){

        }else if(true){

        }else{

        }*/
        String name = "jay";
        if(name.equals("j")){
            logger.info("name = j");
        }else if(name.equals("jay")){
            logger.info("name = jay");
        }else{
            logger.info("name != j and name != jay");
        }
        switch ('a'){ // char Integer byte or short
            case 'a':
                logger.info("switch a");
                break;
            case 'b':
                logger.info("switch b");
                break;
            default:
                logger.info("switch c");
                break;

        }

    }
}
