package construction.singleton;

public final class Singleton {
    private static Singleton instance;
    public int x;
    public int y;

    private Singleton() {
        this(0, 0);
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static synchronized Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public int Somme(int x, int y) {
        return x + y;
    }

    public float moyenne(int x, int y) {
        return ((long) x + y) / 2.0f;
    }

    public void affiche() {
        System.out.println("Je suis une instance et mes valeurs sont : x= " + x + " et y= " + y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
