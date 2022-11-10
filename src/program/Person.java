package program;

import program.services.studentRegist;

public class Person implements studentRegist {
    private String namaDepan;
    private String namaBelakang;
    private String alamat;

    public Person() {

    }


    public Person(String fullname, String s) {
    }
    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }
    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }




    @Override
    public String fullname() {
       return "Nama Lengkap: " + this.namaDepan + this.namaBelakang;
    }

    @Override
    public String cardIdentitas() {
        return "Alamat: " + this.alamat;
    }

    @Override
    public void hasil() {

        System.out.println("====== DATA MAHASISWA =======");
        System.out.println(fullname());
        System.out.println(cardIdentitas());
    }

    @Override
    public String toString() {
        return "Person{" +
                "namaDepan='" + namaDepan + '\'' +
                ", namaBelakang='" + namaBelakang + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}

