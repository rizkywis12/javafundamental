package tugasEnamCobaCoba.Controller;

import tugasEnamCobaCoba.Model.Menu;

import tugasEnamCobaCoba.Model.Order;
import tugasEnamCobaCoba.Repository.MenuDao;

import tugasEnamCobaCoba.Services.CrudServices;
import tugasEnamCobaCoba.Services.OrderService;


// Import library
import java.text.SimpleDateFormat;
import java.util.*;

public class MenuController {

    // Variabel yang digunakan
    private static CrudServices<Menu, Integer> makananDao;
    private static CrudServices<Menu, Integer> minumanDao;
    private static CrudServices<Menu, Integer> paketDao;
    private static CrudServices<Menu, Integer> TotalPesanan;
    static Scanner inputUser = new Scanner(System.in);
    static String opsi = "y";
    static int menuApp;
    static int amount;

    public static void main(String[] args) {

        // instance repository
        makananDao = new MenuDao();
        minumanDao = new MenuDao();
        paketDao = new MenuDao();
        TotalPesanan = new MenuDao();


//        orderDao = new OrderDao();

        //  set data

        Menu menu = new Menu();
        Menu makanan = new Menu("Bakso", 10000);
        makananDao.save(makanan);
        makanan = new Menu("Mie Ayam", 12000);
        makananDao.save(makanan);
        makanan = new Menu("Nasi Goreng Spesial", 13000);
        makananDao.save(makanan);
//        minum
        Menu minuman = new Menu("Ice Tea", 5000);
        minumanDao.save(minuman);
        minuman = new Menu("Teh Manis Hangat", 2000);
        minumanDao.save(minuman);
        minuman = new Menu("Aqua", 3500);
        minumanDao.save(minuman);
//        Paket
        Menu paket = new Menu("Bakso + Es Teh", 14000);
        paketDao.save(paket);
        paket = new Menu("Mie Ayam + Teh Manis Hangat", 13400);
        paketDao.save(paket);
        paket = new Menu("Nasi Goreng Sepcial + Aqua", 51000);
        paketDao.save(paket);


        do {
            // Main Menu
            System.out.println("""

                    \n========== SERBA SERBI MAKANAN ==========\s
                    1. Daftar Menu
                    2. Pemesanan
                    3. Pembayaran"""
            );

            // Mengambil input user
            System.out.print("Pilih Menu : ");
            menuApp = inputUser.nextInt();
            inputUser.nextLine();

            switch (menuApp) {
                case 1 -> {
                    System.out.println("\n---------- Daftar Menu ----------");
                    System.out.println("\n---------- PAKET ----------");
                    int i = 0;
                    for (Menu paketMenu : paketDao.findAll()) {
                        i++;
                        System.out.println(i + ". " + paketMenu);
                    }

                }
                case 2 -> {
                    while (opsi.equals("y")) {
                        System.out.println("""
                    ========== PEMESANAN ==========\s
                    1. Makanan
                    2. Minuman
                    3. Paket
                    4. Hapus Pesanan"""
                        );
                        System.out.print("Pilih Menu : ");
                        int pilihMenu = inputUser.nextInt();
                        inputUser.nextLine();

                        switch (pilihMenu) {
                            case 1 -> {

                                int i = 0;
                                for (Menu makananMenu : makananDao.findAll()) {
                                    i++;
                                    System.out.println(i + ". " + makananMenu);
                                }

                                // Mengambil input user
                                System.out.print("Pilih Makanan : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index - 1);
                                TotalPesanan.save(makananDao.findById(menu.getTotalPesanan()));
                                int j = 0;
                                for (Menu totalpesan : TotalPesanan.findAll()) {
                                    j++;
                                    System.out.println(" Pesanan Anda : ");
                                    System.out.println(j + ". " + totalpesan);
                                }
                            }

                            case 2 -> {
                                int j = 0;
                                for (Menu minumanMenu : minumanDao.findAll()) {
                                    j++;
                                    System.out.println(j + ". " + minumanMenu);
                                }
                                System.out.print("Pilih Minuman : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index - 1);
                                int i = 0;
                                for (Menu totalpesan : TotalPesanan.findAll()) {
                                    i++;
                                    System.out.println(" Pesanan Anda : ");
                                    System.out.println(i + ". " + totalpesan);

                                }
                                TotalPesanan.save(minumanDao.findById(menu.getTotalPesanan()));
                                System.out.print("Pesanan Anda : " + TotalPesanan.findAll() + "\n");

                            }
                            case 3 -> {

                                int j = 0;
                                for (Menu paketmenu : paketDao.findAll()) {
                                    j++;
                                    System.out.println(j + ". " + paketmenu);
                                }
                                System.out.print("Pilih Paket : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index - 1);
                                TotalPesanan.save(paketDao.findById(menu.getTotalPesanan()));
                                System.out.print("Pesanan Anda : " + TotalPesanan.findAll() + "\n");
                            }
//                                case 4 -> {
//                                    System.out.println("\n========== GANTI PESANAN ==========");
//
//                                    // Mencetak pesanan
//                                    int i = 0;
//                                    for (Menu totalpesan : TotalPesanan.findAll()) {
//                                        i++;
//                                        System.out.println(" Pesanan Anda : ");
//                                        System.out.println( i + ". " +   totalpesan);
//                                    }
//                                    // Mengambil input user
//                                    System.out.print("Pilih pesanan yang akan di update : ");
//                                    int index = inputUser.nextInt();
//                                    menu.setTotalPesanan(index-1);
//
//                                    // Delete data pesanan
//
//                                    int j = 0;
//                                    for (Menu makananMenu : makananDao.findAll()) {
//                                        j++;
//                                        System.out.println(j + ". " + makananMenu);
//                                    }
//                                    int ganti = inputUser.nextInt();
//
//                                    inputUser.nextLine();
//
//                                    System.out.println("Pesanan berhasil di ganti");
//
//                                    // Mencetak pesanan setelah terhapus
//                                    System.out.print("Pesanan Anda : " + TotalPesanan.findAll() + "\n");
//
//                                }


                            case 5 -> {
                                System.out.println("\n========== Hapus Pesanan ==========");

                                // Mencetak pesanan
                                int i = 0;
                                for (Menu totalpesan : TotalPesanan.findAll()) {
                                    i++;
                                    System.out.println(" Pesanan Anda : ");
                                    System.out.println( i + ". " +   totalpesan);
                                }
                                // Mengambil input user
                                System.out.print("Pilih pesanan yang akan dihapus : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index-1);
                                // Delete data pesanan
                                TotalPesanan.delete(index - 1);
                                System.out.println("Pesanan berhasil dihapus!");

                                // Mencetak pesanan setelah terhapus
                                System.out.print("Pesanan Anda : " + TotalPesanan.findAll() + "\n");
                            }


                            default -> System.out.println("Menu tidak tersedia!");
                        }
                        System.out.print("\nApakah ingin melanjutkan program? (y/n): ");
                        opsi = inputUser.nextLine();

                    }

                }


                case 3 -> {
                    int Total =0;
                    int j = 0;
                    for (Menu totalpesan : TotalPesanan.findAll()) {
                        j++;
                        System.out.println(" Pesanan Anda : ");
                        System.out.println( j+ ". " +   totalpesan);

                        Total += totalpesan.getHarga();
                    }
                    System.out.println("\nPPN\n");
                    System.out.println(Total * 11/100);
                    System.out.println("\nTOTAL HARGA\n");
                    System.out.println(Total+(Total * 11/100));
                    System.out.println("\n==========================================\n");
                    System.out.print("Input your amount: ");
                    amount = inputUser.nextInt();
                    inputUser.nextLine();

                    if (amount < Total+(Total * 11/100)) {
                        System.out.println("Uang Mu Tidak Cukup");
                    }
                    else {
                        System.out.println("\n========== STRUK ==========");
                        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm.ss aa | dd-MMm-yyyy");
                        String formattedDate = dateFormat.format(new Date()).toString();
                        System.out.println("\n========== ITEMS ==========");
                        int i = 0;
                        for (Menu totalpesan : TotalPesanan.findAll()) {
                            i++;
                            System.out.println("Pesanan Anda : ");
                            System.out.println( i+ ". " +   totalpesan);
                        }
                        System.out.println("\n==== TANGGAL TRANSAKSI =====");
                        System.out.println(formattedDate);
                        System.out.println("\nBERHASIL BAYAR " + amount);
                        System.out.println("\nTengkyu cuy!!!");
//                        TotalPesanan.delete(menu.getTotalPesanan());
                    }


                }

                default -> System.out.println("Silahkan pilih menu yang tersedia!.\n");
            }

            System.out.print("\nApakah ingin melanjutkan program? (y/n): ");
            opsi = inputUser.nextLine();
        } while (opsi.equalsIgnoreCase("y"));

    }
}