package bangun;

import bangun.service.BangunRuangService;

public class Bola extends Lingkaran implements BangunRuangService {


    public Bola(int jariJari) {
        super(jariJari);
    }

    @Override
    public void bentuk() {
        System.out.println("========= Bola ==========");
    }

    @Override
    public void karakteristik() {
        System.out.println("1. Tidak memiliki rusuk dan titik sudut");
        System.out.println("2. Memiliki satu bidang sisi lengkung, yakni selimut bola");
        System.out.println("3. Terdapat jari-jari dan diameter");
    }

    public double volume(){
        return 4 * super.luas();
    }

    public void getVolume(){
        System.out.println("Volume Bola adalah : " + volume());
    }
    }
