package singleton;

public final class Bancher {

    private static Bancher instance;

    private int nextId;

    private Bancher() {
        this.nextId = 1001;
    }

    public static Bancher getInstance() {
        if (instance == null) {
            instance = new Bancher();
        }

        return instance;
    }

    public ContBancar deschidereCont(String tip) {

        ContBancar cont;

        if (tip.equals("Debit")) {
            cont = new ContDebitor();
        } else if (tip.equals("Credit")) {
            cont = new ContCreditor();
        } else {
            return null;
        }

        cont.id += nextId++;
        return cont;
    }
}
