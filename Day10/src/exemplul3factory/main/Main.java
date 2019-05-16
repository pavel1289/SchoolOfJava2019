package exemplul3factory.main;

import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.sayHello("Bill");

        Runtime.getRuntime().availableProcessors(); ///sngleton
        Locale loc = new Locale.Builder()   ///builder
                .setLanguage("en")
                .setRegion("US")
                .build();
        List<Integer> list = List.of(1,2,3,4,5,6); //java 1.9+
        Path path = Paths.get("C:/A"); ///factory
    }
}
