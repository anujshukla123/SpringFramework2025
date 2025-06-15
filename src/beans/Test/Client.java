package beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Constructor;

import java.lang.reflect.Constructor;


public class Client {

    public static void main(String[] args) {
    Resource r=new ClassPathResource("resources/Spring.xml");
    BeanFactory factory=new XmlBeanFactory(r);
        System.out.println("document valid");
        factory.getBean("t");
    ApplicationContext context=new ClassPathXmlApplicationContext("resources/Spring.xml");//Eager loading
        //ApplicationContext: check Xml document
        //it will create instances to singleton beans

       Object abc=context.getBean("t");
        Test t1=(Test) abc;
        t1.eagerLoading();
    Object o=factory.getBean("t");
    Test t=(Test)o;
    //t.hello();

        Object o1=factory.getBean("t");
        Object o2=factory.getBean("t");
        Object o3=factory.getBean("t");
        System.out.println(o1==o2);//In singleton , object reference to same object, output true
        System.out.println(o2==o3);///but in prototype, it creates different objects, then we got output as False

        //Access private constructor in Spring
        try
        {
            Class c=Class.forName("beans.Test");
            Constructor con[]=c.getDeclaredConstructors();
            con[0].setAccessible(true);
            con[0].newInstance(null);
        }
        catch(Exception e)
        {}
    }
}
