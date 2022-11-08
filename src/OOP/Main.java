package OOP;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String menu;
    String firstName, lastName,birthplace;
    Integer birthyear;
    String elementarySchool, juniorHighSchool, seniorHighSchool, university;

    public void menuApp() {
        System.out.println("===== INFORMASI BIODATA =====");
        System.out.println("1. Input data diri");
        System.out.println("2. Input data pendidikan");
        System.out.println("3. Tampilkan data diri");
        System.out.println("4. Tampilkan data pendidikan");
        System.out.println("===== PILIH MENU =====");
        System.out.print("Pilihan user: ");
        menu = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();

        do {
            main.menuApp();

            switch (main.menu) {
                case "1":
                    System.out.println("======= Masukan Data Diri Anda ===========");
                    System.out.print("Masukan Nama Depan : ");
                    main.firstName = main.scanner.nextLine();
                    System.out.print("Masukan Nama Belakang : ");
                    main.lastName = main.scanner.nextLine();
                    System.out.print("Masukan Tempat Lahir : ");
                    main.birthplace = main.scanner.nextLine();
                    System.out.print("Masukan Tahun Lahir : ");
                    main.birthyear = Integer.valueOf(main.scanner.nextLine());
                    System.out.println("======== Data disimpan =========");
                    break;

                case "2":
                    System.out.println("======= Masukan Data Pendidikan Anda ===========");
                    System.out.print("SD : ");
                    main.elementarySchool = main.scanner.nextLine();
                    System.out.print("SMP : ");
                    main.juniorHighSchool = main.scanner.nextLine();
                    System.out.print("SMK : ");
                    main.seniorHighSchool = main.scanner.nextLine();
                    System.out.print("Universitas : ");
                    main.university = main.scanner.nextLine();
                    System.out.println("======== Data disimpan =========");
                    break;

                case "3":
                    System.out.println("========== DATA DIRI ANDA ==========");
                    Bio person = new Bio(main.firstName, main.lastName,main.birthplace,main.birthyear);
                    person.getBio();
                    break;

                case "4":
                    System.out.println("========== DATA PENDIDIKAN ANDA ==========");
                   Education education = new Education(
                           main.elementarySchool, main.juniorHighSchool, main.seniorHighSchool, main.university
                   );
                   education.getEducation();
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

