package bangun;

public class Persegi extends Main{
    private Integer sisi ;

    public Persegi(int sisi) {
        this.sisi = sisi;
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

