package callback;

public class Main {

    public static void main(String[] args) {

        Vector v = new Vector(5);
        v.addHandler(new Math());

        System.out.println("Suma este: " + v.prelucreaza(1));
        System.out.println("Produsul este: " + v.prelucreaza(2));
        System.out.println("Minimul este: " + v.prelucreaza(3));
        System.out.println("Maximul este: " + v.prelucreaza(4));
        System.out.println("Media este: " + v.prelucreaza(5));
    }
}
