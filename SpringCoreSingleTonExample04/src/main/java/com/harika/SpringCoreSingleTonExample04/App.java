package com.harika.SpringCoreSingleTonExample04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.harika.Pojo.SpringBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new  ClassPathResource("spring.xml"));
        SpringBean bean = (SpringBean)factory.getBean("harika");
        SpringBean bean1 = (SpringBean)factory.getBean("harika");
        SpringBean bean2 = (SpringBean)factory.getBean("harika");
        SpringBean bean3 = (SpringBean)factory.getBean("harika");
        SpringBean bean4 = (SpringBean)factory.getBean("harika");
        System.out.println(bean+"\t"+bean1+"\t"+bean2+"\t"+bean3+"\t"+bean4);
    }
}
