package JavaTraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.*;
import java.util.Date;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java06DateNumberCurrency {
    Logger logger = LoggerFactory.getLogger(Java06DateNumberCurrency.class);
    public static void main(String[] args){
        Java06DateNumberCurrency java06DateNumberCurrency = new Java06DateNumberCurrency();
        java06DateNumberCurrency.date();
        java06DateNumberCurrency.number();

    }
    private void date(){

        logger.info("new Date() : {}",new Date());
        Date date = new Date("1/11/1994");//month/day/year
        logger.info("new Date(\"01/11/1994\") :{}",date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        logger.info("simpleDateFormat.format : {}",simpleDateFormat.format(date));
        try {
            logger.info("simpleDateFormat.parse : {}",simpleDateFormat.parse("11/1/1994"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private void number(){
        String money = "1,000,000";
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        try {
            Integer moneyInt = numberFormat.parse(money).intValue();
            logger.info("moneyInt : {}",moneyInt);
            logger.info("10000000 to  {}",numberFormat.format(10000000));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
