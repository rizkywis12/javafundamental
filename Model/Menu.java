package tugasEnamCobaCoba.Model;

public class Menu  {



    private  String menu;
    private  Integer harga;
    private Integer totalPesanan;


    // Constructor
    public Menu(){

    }

    public Menu(String menu, Integer harga) {
        this.menu = menu;
        this.harga = harga;
    }

    public Integer getTotalPesanan() {
        return totalPesanan;
    }

    public Menu setTotalPesanan(Integer totalPesanan) {
        this.totalPesanan = totalPesanan;
        return null;
    }

    public String getMenu() {
        return this.menu;
    }

    public boolean setMenu(String menu) {
        this.menu = menu;
        return false;
    }

    public Integer getHarga() {
        return this.harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return menu + " - Rp. " + harga  + "\n";
    }
}
    //
//    // Variabel yang digunakan
//    private String makanan, minuman, paket, harga, total;
//
//    // Default constructor
//    public Menu (){};
//
//    // Constructor
//    public Menu(String makanan, String minuman, String harga) {
//        this.makanan = makanan;
//        this.minuman = minuman;
//        this.harga = harga;
//    }
//
//    // Setter
//    public void setMakanan(String makanan) {
//        this.makanan = makanan;
//    }
//    public void setMinuman(String minuman) {
//        this.minuman = minuman;
//    }
//    public void setPaket(String paket) {
//        this.paket = paket;
//    }
//    public void setHarga(String harga) {
//        this.harga = harga;
//    }
//    public void setTotal(String makanan, String minuman, String total) {
//        this.makanan = makanan;
//        this.minuman = minuman;
//        this.total = total;
//    }
//
//    // Getter
//    public String getMakanan() {
//        return makanan;
//    }
//    public String getMinuman() {
//        return minuman;
//    }
//    public String getPaket() {
//        return paket;
//    }
//    public String getHarga() {
//        return harga;
//    }
//    public String getTotal() {
//        return total;
//    }
//
//    // Method untuk menampilkan daftar menu
//    public void daftarMenu() {
////
//
//        System.out.println("""
//
//                    ========== Menu Minuman Cerdas ==========\s
//                    1. Teh Manis                -- Rp 8000
//                    2. Es Jeruk                 -- Rp 10000
//                    3. Kopi Susu                -- Rp 12000
//                    4. Air Mineral              -- Rp 5000"""
//        );
//        System.out.println("""
//
//                    ========== Menu Paket Bahagia ==========\s
//                    1. Paket Lengkap Ayam       -- Rp 20000
//                    2. Paket Lengkap Ikan       -- Rp 28000
//                    3. Paket Campur 1           -- Rp 30000
//                    4. Paket Campur 2           -- Rp 28000"""
//        );
//
//    }

