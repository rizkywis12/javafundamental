package program;

import program.services.learningPlanService;
import program.services.studentRegist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Main {
    Scanner scanner = new Scanner(System.in);
    String menu;
    public void menuApp() {
        System.out.println("===== PROGRAM APP =====");
        System.out.println("1. Insert Student");
        System.out.println("2. Learning Plan Add");
        System.out.println("3. CETAK DATA ");

        System.out.println("===== PILIH MENU =====");
        System.out.print("Pilihan user: ");
        menu = scanner.nextLine();
    }

    public static void main(String[] args) {


        Main main = new Main();
        studentRegist studentRegist;
        learningPlanService learningPlanService;
        Person person = new Person();
        Student student = new Student();
        List<learningPlanService> learningplans = new ArrayList<>();
        List<studentRegist> studentRegists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            main.menuApp();

            switch (main.menu) {
                case "1":
                    System.out.println("Masukan Nama Depan ");
                    person.setNamaDepan(scanner.next());
                    System.out.println("Masukan Nama Belakang ");
                    person.setNamaBelakang(scanner.next());
                    System.out.println("Masukan Id");
                    person.setAlamat(scanner.next());
                    studentRegist = new Person(person.fullname(), person.cardIdentitas());
                    studentRegists.add(studentRegist);

                    break;

                case "2":
                    System.out.println("\nLearning Plan\n");
                    System.out.print("Masukan Course Name: ");
                    student.setCourseName(scanner.next());
                    System.out.print("Masukan Room : ");
                    student.setRoom(scanner.next());
                    System.out.print("Masukan SKS :");
                    student.setSks(scanner.nextInt());
                    learningPlanService = new Student(student.getCourseName(),student.getRoom(),student.getSks());
                    learningplans.add(learningPlanService);
                    System.out.println("TERSIMPAN..");
                    break;

                case "3":
                    System.out.println(person);
                    System.out.println(student);
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

