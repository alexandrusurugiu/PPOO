package callback;

public class Math implements IPrelucrare {
    @Override
    public int suma(int[] v) {

        int suma = 0;

        for (int i : v) {
            suma += i;
        }

        return suma;
    }

    @Override
    public int produs(int[] v) {

        int produs = 1;

        for (int i : v) {
            produs = produs * i;
        }

        return produs;
    }

    @Override
    public int minim(int[] v) {

        int min = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
        }

        return min;
    }

    @Override
    public int maxim(int[] v) {

        int max = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }

        return max;
    }

    @Override
    public float medie(int[] v) {

        return suma(v) / v.length;
    }
}
