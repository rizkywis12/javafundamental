package bangun;


import bangun.service.BangunRuangService;

public class Kubus extends Persegi implements BangunRuangService {

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

    @Override
    public void bentuk() {
        System.out.println("====== Kubus ====");
    }

    @Override
    public void karakteristik() {
        System.out.println("1. Mempunyai 12 rusuk yang sama panjang");
        System.out.println("2. Mempunyai 12 diagonal sisi dengan ukuran yang sama panjang");
        System.out.println("3. Mempunyai 4 diagonal ruang dengan ukuran yang sama panjang");
    }

    @Override
    public Integer getSisi() {
        return super.getSisi();
    }

    @Override
    public void getVolume() {
        Float volume = Float.valueOf(super.getSisi() * super.getSisi() * super.getSisi());
        System.out.println("Volume Kubus: " + volume);
    }
}