package jp.blackawa.example.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
        HelloWorld hw = service.getHelloWorld();
        hw.sayHello();
    }
}
