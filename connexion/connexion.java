package connexion;

public final class connexion {
    private static connexion dbconnexion;
    private final String name;
    private final String pass;

    private connexion(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public static synchronized connexion createconnexion(String name, String pass) {
        if (dbconnexion == null) {
            dbconnexion = new connexion(name, pass);
        }
        return dbconnexion;
    }
}
