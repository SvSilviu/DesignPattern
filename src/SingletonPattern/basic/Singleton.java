package SingletonPattern.basic;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getDescription() {
        return "Eu sunt varianta de Singleton basic";
    }
}
