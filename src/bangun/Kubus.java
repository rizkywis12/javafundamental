package bangun;

public class Kubus extends Persegi{

    public Kubus(int sisi) {
        super(sisi);
    }

    public void setSisi(Integer sisi) {
        super.setSisi(sisi);
    }
    @Override
    public float keliling() {
        return super.keliling();
    }
    @Override
    public float luas() {
        System.out.println("Luas Permukaan adalah : " + super.luas());
        return Float.valueOf(0);
    }


    public void getKubus() {
        Float volume = Float.valueOf(super.getSisi() * super.getSisi() * super.getSisi());
        System.out.println("Volume Kubus: " + volume);
    }
}