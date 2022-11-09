package bangun;

public class Segitiga extends Main{
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas(){
        return this.alas * this.tinggi;
    }
    public void getHasil() {
        System.out.println("Luas Segitiga: " + luas());
    }
}