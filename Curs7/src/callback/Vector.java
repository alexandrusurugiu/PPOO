package callback;

public class Vector {

    private IPrelucrare handler = null;

    private int[] valori;

    public Vector(int n) {

        valori = new int[n];

        for (int i = 0; i < n; i++) {
            valori[i] = i + 1;
        }
    }

    public void addHandler(IPrelucrare handler) {
        this.handler = handler;
    }

    public int prelucreaza (int tip) {

        return switch (tip) {
            case 1 -> handler.suma(valori);
            case 2 -> handler.produs(valori);
            case 3 -> handler.minim(valori);
            case 4 -> handler.maxim(valori);
            case 5 -> (int) handler.medie(valori);
            default -> 0;
        };
    }
}
