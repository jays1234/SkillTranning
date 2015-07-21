package JavaTraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java03Loop {
    public static void main(String arg[]){
        Logger logger = LoggerFactory.getLogger(Java03Loop.class);


       int i=0;
        while(i<10){
            logger.info("while loop : {}",i);
            i++;
        }

       /* int i =10;
        do{
            logger.info("do while loop :{}",i);
            i--;
        }while(i>=1);*/

       /* for(int i=0;i<10;i++){
            logger.info("for loop {}",i);
        }*/

        /*for(char a:"String".toCharArray()){
            logger.info("for each {}",a);
        }*/
    }
}
