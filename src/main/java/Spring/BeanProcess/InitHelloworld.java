package Spring.BeanProcess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by phirayu on 23/7/2558.
 */
public class InitHelloworld implements BeanPostProcessor {
    Logger logger = LoggerFactory.getLogger(InitHelloworld.class);
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("init {}",beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("After init {}",beanName);
        return bean;
    }
}
