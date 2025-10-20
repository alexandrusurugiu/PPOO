package singleton;

public final class ContDebitor extends ContBancar implements IBeneficii {

    public final double BALANTA_MIN = 10;

    ContDebitor() {

        this.balanta = BALANTA_MIN;
        this.id = "ContD";
        this.titular = "Anonim";
    }

    @Override
    public void retragere(double suma) throws ExceptieFonduriInsuficiente {

        if ((balanta - suma) < BALANTA_MIN) {
            throw new ExceptieFonduriInsuficiente();
        }

        balanta -= suma;
    }

    @Override
    public void adaugaDobanda(float rata, int perioada) {
        this.balanta = balanta*(1+rata*perioada/100);
    }
}
