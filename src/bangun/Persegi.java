package bangun;

import bangun.service.BangunDatarService;

public class Persegi implements BangunDatarService {
    private Integer sisi ;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void bentuk() {
        System.out.println("========= Persegi ===========");
    }

    @Override
    public void karakteristik() {
        System.out.println("1. Memiliki sisi-sisi yang sama panjang");
        System.out.println("2. Memiliki dua diagonal yang sama panjang");
        System.out.println("3. Memiliki empat sudut siku-siku yang sama besar");
    }

    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling(){
        return this.sisi * 4;
    }

    public Integer getSisi() {
        return sisi;
    }

    public void setSisi(Integer sisi) {
        this.sisi = sisi;
    }

    public void getHasil() {
        System.out.println("Luas persegi: " + luas());
        System.out.println("keliling persegi: " + keliling());
    }
}

