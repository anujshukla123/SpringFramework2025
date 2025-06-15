package Setter_DI_2Type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("resources/Car.xml");//Eager loading

//        String files[] = new String[]{"resources/Car.xml","resources/Engine.xml"};
//        ApplicationContext context = new ClassPathXmlApplicationContext(files);//Eager loading
          ApplicationContext context = new ClassPathXmlApplicationContext("resources/car-engine.xml");//Eager loading
        Car c=(Car) context.getBean("c");
        c.printCarData();
    }
}
