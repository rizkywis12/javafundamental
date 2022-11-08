package OOP;

public class Bio {
    private String firstName;
    private String lastName;
    private String birthplace;
    private Integer birthyear;

    public Bio(String firstName, String lastName, String birthplace, Integer birthyear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthplace = birthplace;
        this.birthyear = birthyear;

    }



    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setBirthyear(Integer birthyear) {
        this.birthyear = birthyear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public Integer getBirthyear() {
        return birthyear;
    }

    public Integer getAge() {
        return 2022 - this.birthyear;
    }

    public void getBio() {
        System.out.println("===== BIODATA DIRI =====");
        System.out.println("Nama Lengkap: " + getFullName());
        System.out.println("Nama Depan: " + getFirstName());
        System.out.println("Nama Belakang: " + getLastName());
        System.out.println("Nama Tempat Lahir: " + getBirthplace());
        System.out.println("Nama Tanngal Lahir: " + getBirthyear());
        System.out.println("Usia Anda : " + getAge());
    }
}

