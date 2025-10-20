package singleton;

public final class ContCreditor extends ContBancar {

    public final double MAX_CREDIT = 1000;

    ContCreditor() {
        this.balanta = 0;
        this.id = "ContC";
        this.titular = "Anonim";
    }

    @Override
    public void retragere(double suma) throws ExceptieFonduriInsuficiente {
        if ((balanta - suma) <- MAX_CREDIT) {
            throw new ExceptieFonduriInsuficiente();
        }

        balanta -= suma;
    }
}
