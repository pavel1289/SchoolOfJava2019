package exemplul3factory.api;

import exemplul3factory.impl.HelloEn;
import exemplul3factory.impl.HelloEs;

public interface Hello {

    public String hello(String name);

    public static Hello build() {   ///factory method
        return new HelloEn();
    }
}
