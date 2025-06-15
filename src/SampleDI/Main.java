package SampleDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {


    public static void main(String[] args) {

     ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml");//Eager loading
        Test t =(Test)context.getBean("t");
        t.Hello("Anuj Shukla");
        //ApplicationContext: check Xml document
        //it
    }

}