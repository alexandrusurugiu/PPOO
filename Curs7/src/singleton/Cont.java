package singleton;

public abstract class Cont {

    public abstract void depunere(double suma);

    public abstract void retragere(double suma) throws ExceptieFonduriInsuficiente;

    public abstract double getBalanta();

    public void Transfer(double suma, Cont contDestinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {

        if (contDestinatie == this) {
            ExceptieTransferIlegal ex = new ExceptieTransferIlegal();
            throw ex;
        }

        this.retragere(suma);
        contDestinatie.depunere(suma);
    }
}
