package bangun;

import bangun.service.BangunDatarService;
import bangun.service.BangunRuangService;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String menu;
    Integer sisi,alas,tinggi,jariJari,tinggiPrisma;


    public void menuApp() {
        System.out.println("===== Bangun Datar =====");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("===== Bangun Ruang =====");
        System.out.println("4. Kubus");
        System.out.println("5. Bola");
        System.out.println("6. Prisma");
        System.out.println("===== PILIH MENU =====");
        System.out.print("Pilihan user: ");
        menu = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        BangunDatarService bangunDatarService;
        BangunRuangService bangunRuangService;

        do {
            main.menuApp();

            switch (main.menu) {
                case "1":
                    System.out.println("======= input ===========");
                    System.out.print("Masukan Sisi : ");
                    main.sisi = Integer.valueOf(main.scanner.nextLine());
                    bangunDatarService = new Persegi(main.sisi);
                    bangunDatarService.keliling();
                    bangunDatarService.luas();
                    bangunDatarService.getHasil();
                    System.out.println("\n Bentuk Bangun :");
                    bangunDatarService.bentuk();
                    System.out.println("\nKaraketeristik bangun datar Persegi : \n");
                    bangunDatarService.karakteristik();
                    break;

                case "2":
                    System.out.println("======= input ===========");
                    System.out.print("Masukan Jari Jari : ");
                    main.jariJari = Integer.valueOf(main.scanner.nextLine());
                    bangunDatarService = new Lingkaran(main.jariJari);
                    bangunDatarService.keliling();
                    bangunDatarService.luas();
                    bangunDatarService.getHasil();
                    System.out.println("\n Bentuk Bangun :");
                    bangunDatarService.bentuk();
                    System.out.println("\nKaraketeristik bangun datar Lingkaran : \n");
                    bangunDatarService.karakteristik();

                    break;

                case "3":
                    System.out.println("======= input ===========");
                    System.out.print("Masukan Alas : ");
                    main.alas = Integer.valueOf(main.scanner.nextLine());
                    System.out.print("Masukan Tinggi : ");
                    main.tinggi = Integer.valueOf(main.scanner.nextLine());
                    bangunDatarService  = new Segitiga(main.alas, main.tinggi);
                    bangunDatarService.luas();
                    bangunDatarService.getHasil();
                    System.out.println("\n Bentuk Bangun :");
                    bangunDatarService.bentuk();
                    System.out.println("\nKaraketeristik bangun datar Segitiga : \n");
                    bangunDatarService.karakteristik();

                    break;

                case "4":

                    System.out.println("===== Kubus =====");
                    System.out.print("Masukkan Sisi : ");
                    main.sisi = Integer.valueOf(main.scanner.nextLine());
                    Kubus kubus = new Kubus(main.sisi);
                    bangunRuangService = new Kubus(main.sisi);
                    bangunRuangService.getVolume();
                    System.out.println("\n Bentuk Bangun :");
                    kubus.bentuk();
                    System.out.println("\nKaraketeristik bangun ruang Kubus : \n");
                    kubus.karakteristik();
                    break;
                case "5":
                    System.out.println("======= input ===========");
                    System.out.print("Masukan Jari Jari : ");
                    main.jariJari = Integer.valueOf(main.scanner.nextLine());
                    Bola bola = new Bola(main.jariJari);
                    bangunRuangService = new Bola(main.jariJari);
                    bangunRuangService.getVolume();
                    System.out.println("\n Bentuk Bangun :");
                    bola.bentuk();
                    System.out.println("\nKaraketeristik bangun ruang Bola : \n");
                    bola.karakteristik();


                    break;
                case "6":



                    break;
                default:
                    System.out.println("menu tidak tersedia");
                    break;
            }
            System.out.println("Apakah ingin keluar aplikasi? (y/n)");
            main.menu = main.scanner.nextLine();
        } while (main.menu.equalsIgnoreCase("n"));

        System.out.println("Keluar Aplikasi");
    }
}

