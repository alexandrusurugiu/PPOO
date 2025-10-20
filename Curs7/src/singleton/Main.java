package singleton;

public class Main {

    public static void main(String[] args) {

        Bancher bancher = Bancher.getInstance();

        ContCreditor cc = (ContCreditor) bancher.deschidereCont("Credit");
        cc.setTitular("Gigel");

        ContDebitor cd = (ContDebitor) bancher.deschidereCont("Debit");
        cd.setTitular("Dorel");

        System.out.println("Contul debitor are id-ul: " + cd.getId() + ", titularul: " + cd.getTitular() + " si balanta: " + cd.getBalanta());
        System.out.println("Contul creditor are id-ul: " + cc.getId() + ", titularul: " + cc.getTitular() + " si balanta: " + cc.getBalanta());

        cd.adaugaDobanda(0.15f, 12);
        System.out.println("Contul debitor are id-ul: " + cd.getId() + ", titularul: " + cd.getTitular() + " si balanta: " + cd.getBalanta());
    }
}
