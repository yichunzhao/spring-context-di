package com.ynz.demo.springcontextdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringContextDI {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {

        applicationContext = new AnnotationConfigApplicationContext(SpringContextDI.class);

        for (String bean : applicationContext.getBeanDefinitionNames()) {
            System.out.println(bean);
        }

    }

}
