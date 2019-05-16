package exemplul3factory.impl;

import exemplul3factory.api.Hello;

public class HelloEs implements Hello {
    @Override
    public String hello(String name) {
        return "Hola, " + name + "!";
    }
}
