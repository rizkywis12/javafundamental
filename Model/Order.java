package tugasEnamCobaCoba.Model;

public class Order  {

    private int index, pesanan, tipe, totalHarga;

    // Default constructor
    public Order(){
    }

    // Constructor
    public Order(int index, int pesanan, int tipe){
        this.index = index;
        this.pesanan = pesanan;
        this.tipe = tipe;
    }

    // Sette
    public void setIndex(int index) {
        this.index = index;
    }
    public void setPesanan(int pesanan) {
        this.pesanan = pesanan;
    }
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    // Getter
    public int getIndex() {
        return index;
    }
    public int getPesanan() {
        return pesanan;
    }
    public int getTipe() {
        return tipe;
    }
    public int getTotalHarga() {
        return totalHarga;
    }

}

