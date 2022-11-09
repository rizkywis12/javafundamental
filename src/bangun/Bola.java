package bangun;

public class Bola extends Lingkaran{


    public Bola(int jariJari) {
        super(jariJari);
    }


    public double getVolume(){
        return 4 * super.luas();
    }

    public void getHasil(){
        System.out.println("Volume Bola adalah : " + getVolume());
    }
    }
