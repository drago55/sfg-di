package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("I'am in a LifeCycleBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My Bean name is " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### The LifeCycleBean has been terminated!" );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### The LifeCycleBean has its properties");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#### The Application context has been set.");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("### The post construct annotated has been called.");
    }
}
