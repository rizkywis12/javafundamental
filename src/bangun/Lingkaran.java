package bangun;

import bangun.service.BangunDatarService;

public class Lingkaran implements BangunDatarService {
    int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void bentuk() {
    System.out.println("========= Lingkaran ==========");
    }

    @Override
    public void karakteristik() {
        System.out.println("1. Memiliki jumlah sudut 180 derajat");
        System.out.println("1. Memiliki jari-jari yang menghubungkan titik pusat dengan titik busur lingkaran");
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
