package com.harika.SpringCoreExample03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.harika.Pojo.GreetingModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        GreetingModel greetingModel = (GreetingModel)factory.getBean("harika");
        System.out.println(greetingModel.getName());
        
        System.out.println("-------------------------------------");
        String aliasNames[] = factory.getAliases("naidu");
        for(String str:aliasNames){
        	System.out.println(str);
        }
    }
}
