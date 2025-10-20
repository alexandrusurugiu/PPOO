package singleton;

public abstract class ContBancar extends Cont {

    protected double balanta;

    protected String titular;

    String id;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getId() {
        return id;
    }

    @Override
    public double getBalanta() {
        return balanta;
    }

    @Override
    public void depunere(double suma) {
        this.balanta += suma;
    }
}
