package OOP;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String opsi;
    String firstName, lastName,birthplace;
    Integer birthyear;
    String elementarySchool, juniorHighSchool, seniorHighSchool, university;

    public void menuApp() {
        System.out.println("===== INFORMASI BIODATA =====");
        System.out.println("1. Input data diri");
        System.out.println("2. Input data student");
        System.out.println("3. Tampilkan data diri");
        System.out.println("4. Tampilkan data student");
        System.out.println("===== PILIH MENU =====");
        System.out.print("Pilihan user: ");
        opsi = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();

        do {
            main.menuApp();

            switch (main.opsi) {
                case "1":
                    System.out.println("======= Masukan Data Diri Anda ===========");
                    System.out.print("Masukan Nama Depan : ");
                    main.firstName = main.scanner.nextLine();
                    System.out.print("Masukan Nama Belakang : ");
                    main.lastName = main.scanner.nextLine();
                    System.out.print("Masukan Tempat Lahir : ");
                    main.birthplace = main.scanner.nextLine();
                    System.out.print("Masukan Tanggal Lahir : ");
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
                    System.out.println("menampilkan data diri");
                    Bio person = new Bio(main.firstName, main.lastName,main.birthplace,main.birthyear);
                    person.getBio();
                    break;

                case "4":
                   Education education = new Education(
                           main.elementarySchool, main.juniorHighSchool, main.seniorHighSchool, main.university
                   );
                   education.getEducation();
                    break;

                default:
                    System.out.println("menu tidak tersedia");
                    break;
            }
            System.out.println("Apakah ingin keluar aplikasi? (y|n)");
            main.opsi = main.scanner.nextLine();
        } while (main.opsi.equalsIgnoreCase("n"));

        System.out.println("Log out.. silahkan datang kembali");
    }
}

