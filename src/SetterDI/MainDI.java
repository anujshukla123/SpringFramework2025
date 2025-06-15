package SetterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDI {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml");//Eager loading
        Test t =(Test)context.getBean("t");
        t.printData();
        //ApplicationContext: check Xml document
        //it
    }
}
