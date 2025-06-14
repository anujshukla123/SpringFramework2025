package beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;

public class Client {

    public static void main(String[] args) {
    Resource r=new ClassPathResource("resources/Spring.xml");
    BeanFactory factory=new XmlBeanFactory(r);

    Object o=factory.getBean("t");
    Test t=(Test)o;
    t.hello();

        Object o1=factory.getBean("t");
        Object o2=factory.getBean("t");
        Object o3=factory.getBean("t");
        System.out.println(o1==o2);
        System.out.println(o2==o3);
    }
}
