package exemplul4observer.main;


import java.awt.*;
import java.util.ArrayList;

public class Subject {
    private List<MyListener> list = new ArrayList<>();

    public void addListener(MyListener listener) {
        list.add(listener);
    }

    public void event() {
        list.forEach(MyListener::somethingHappened);
    }
}
