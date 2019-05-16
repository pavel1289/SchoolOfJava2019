package exemplu1singleton;
/// nu e thread-safe
public class MySingleton1 {
    private static MySingleton1 singleton;

    private MySingleton1() {}

    public static MySingleton1 getInstance() {
        if (singleton == null) {
            singleton = new MySingleton1();
        }
        return singleton;
    }
}
