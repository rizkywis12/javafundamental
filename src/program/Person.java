package program;

import program.services.studentRegist;

public class Person implements studentRegist {
    private String namaDepan;
    private String namaBelakang;
    private int cardIdentitas;



    public Person(String namaDepan, String namaBelakang, int cardIdentitas) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.cardIdentitas = cardIdentitas;
    }

    public Person() {

    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }
    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }
    public void setCardIdentitas(int cardIdentitas) {
        this.cardIdentitas = cardIdentitas;
    }




    @Override
    public String fullname() {
        return this.namaDepan + this.namaBelakang;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public int getCardIdentitas() {
        return cardIdentitas;
    }

    @Override
    public int cardIdentitas() {
        return Integer.parseInt("Id: " + this.cardIdentitas);
    }


    @Override
    public String toString() {
        return "Student Data:" + " card='" + this.cardIdentitas + '\''+
                "Nama Lengkap='" + fullname() + '\'';
    }

}

