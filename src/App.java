import java.util.Scanner;

public class App {
    private String firstname,
            lastname,
            birthplace,
            birthyear,
            programlangFav;

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    public String getBirthplace() {
        return birthplace;
    }


    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getBirthyear() {
        return birthyear;
    }



    public String getProgramlangFav() {
        return programlangFav;
    }
    public void setProgramlangFav(String programlangFav)     {
        this.programlangFav = programlangFav;
    }








}

class bio {
    public static void main(String[] args) {
        App app = new App();
        System.out.println("============== MASUKAN DATA ANDA ==================");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukan nama depan anda : ");
        String firstname = myObj.nextLine();
        app.setFirstname(firstname);
        //
        System.out.print("Masukan nama belakang anda : ");
        String lastname = myObj.nextLine();
        app.setLastname(lastname);
        //
        System.out.print("Masukan tempat lahir anda : ");
        String birthplace = myObj.nextLine();
        app.setBirthplace(birthplace);
        //
        System.out.print("Masukan tanggal lahir anda : ");
        String birthday = myObj.nextLine();
        app.setBirthyear(birthday);
        //
        System.out.print("Masukan prgram favorit anda : ");
        String programlang = myObj.nextLine();
        app.setProgramlangFav(programlang);
        myObj.close();
        System.out.println("============== DATA KAMU ==================");
        System.out.println("Nama depan : " + app.getFirstname());
        System.out.println("Nama belakang:  " +app.getLastname());
        System.out.println("Tempoat Lahir : " +app.getBirthplace());
        System.out.println("Tanggal Lahir : " +app.getBirthyear());
        System.out.println("Program lang fav : " +app.getProgramlangFav());
    }
}

