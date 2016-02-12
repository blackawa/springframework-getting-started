package jp.blackawa.example.helloworld;

public class StrutsHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Hello from Struts!");
    }
}
