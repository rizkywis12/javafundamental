package tugasEnamCobaCoba.Model;

public class Order {

    private int kuantitas, totalHarga;
    private Menu menu;

    // Default constructor
    public Order() {
    }

    // Constructor
    public Order(int kuantitas, int totalHarga) {
        this.kuantitas = kuantitas;
        this.totalHarga = totalHarga;

    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}

