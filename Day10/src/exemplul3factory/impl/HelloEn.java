package exemplul3factory.impl;

import exemplul3factory.api.Hello;

public class HelloEn implements Hello {
    @Override
    public String hello(String name) {
        return "Hello, " + name + "!";
    }
}
