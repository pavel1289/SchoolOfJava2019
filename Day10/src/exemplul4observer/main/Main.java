package exemplul4observer.main;

public class Main {
    public static void main(String[] args) {
        Subject s = new Subject();

        s.addListener(() -> System.out.println("Bau"));
        s.addListener(() -> System.out.println("Bau again"));
        s.addListener(() -> System.out.println("Bau again again"));
        s.addListener(() -> System.out.println("Bau again again again"));

        s.event();
    }
}
