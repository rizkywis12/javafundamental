package bangun;

public class Lingkaran extends Main {
    int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public float luas(){
        return (float) (Math.PI * jariJari * jariJari);
    }

    @Override
    public float keliling(){
        return (float) (2 * Math.PI * jariJari);
    }

    public void getHasil() {
        System.out.println("Luas Lingkaran: " + luas());
        System.out.println("keliling Lingkaran: " + keliling());
    }
}
