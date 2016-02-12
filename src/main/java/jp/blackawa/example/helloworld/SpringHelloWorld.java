package jp.blackawa.example.helloworld;

public class SpringHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Hello from Spring!");
    }
}
