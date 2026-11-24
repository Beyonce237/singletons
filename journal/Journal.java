package journal;

public final class Journal {
    private static Journal instance;
    private final String nomApplication;
    private final String niveau;

    private Journal(String nomApplication, String niveau) {
        this.nomApplication = nomApplication;
        this.niveau = niveau;
    }

    public static synchronized Journal createJournal(String nomApplication, String niveau) {
        if (instance == null) {
            instance = new Journal(nomApplication, niveau);
        }
        return instance;
    }

    public void ecrire(String message) {
        System.out.println("[" + niveau + "] " + nomApplication + " - " + message);
    }
}
