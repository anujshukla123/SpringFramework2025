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
    }
}
