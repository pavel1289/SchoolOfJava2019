package exemplul3factory.main;

import exemplul3factory.api.Hello;
import exemplul3factory.impl.HelloEn;

public class Person {

    private Hello hello;

    public Person() {
        this.hello = Hello.build();
    }

    public void sayHello(String name) {
        String s = hello.hello(name);
        System.out.println(s);
    }
}
