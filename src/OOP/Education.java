package OOP;

public class Education {
    private String ElementarySchool;
    private String JuniorHighSchool;
    private String SeniorHighSchool;
    private String University;

    public Education(String elementarySchool, String juniorHighSchool, String seniorHighSchool, String university) {
        this.ElementarySchool = elementarySchool;
        this.JuniorHighSchool = juniorHighSchool;
        this.SeniorHighSchool = seniorHighSchool;
        this.University = university;
    }

    public String getElementarySchool() {
        return ElementarySchool;
    }

    public String getJuniorHighSchool() {
        return JuniorHighSchool;
    }

    public String getSeniorHighSchool() {
        return SeniorHighSchool;
    }

    public String getUniversity() {
        return University;
    }

    public void getEducation() {
        System.out.println("===== DATA SEKOLAH =====");
        System.out.println("SD : " + getElementarySchool());
        System.out.println("SMP : " + getJuniorHighSchool());
        System.out.println("SMK : " + getSeniorHighSchool());
        System.out.println("Universitas : " + getUniversity());
    }
}
