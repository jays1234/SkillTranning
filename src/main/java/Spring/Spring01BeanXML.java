package Spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by phirayu on 23/7/2558.
 */
public class Spring01BeanXML {
    private String message;
    private List<String> stringList;
    Logger logger = LoggerFactory.getLogger(Spring01BeanXML.class);

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansConfig.xml");
        Spring01BeanXML spring01BeanXML = (Spring01BeanXML)context.getBean("beanXml");
        spring01BeanXML.run();
        context.destroy();

    }
    private void run(){

        logger.info("message : {}",message);
        for(String string:stringList){
            logger.info("List : {}",string);
        }
    }

    private void init(){
        logger.info("init Method");
    }
    private void destory(){
        logger.info("destory Method");
    }
}
