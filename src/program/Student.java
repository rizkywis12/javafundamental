package program;

import program.services.learningPlanService;

public class Student implements learningPlanService {

    private String courseName;
    private String room;
    private int sks;
    public Student(){

    }


    public Student(String courseName, String room, int sks){
        this.courseName = courseName;
        this.room = room;
        this.sks = sks;
    }



    public String getCourseName() {
        return courseName;
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public String getRoom() {
        return room;
    }



    public void setRoom(String room) {
        this.room = room;
    }



    public int getSks() {
        return sks;
    }



    public void setSks(int sks) {
        this.sks = sks;
    }



    public void learningPlan() {
        System.out.println("====== DATA LEARNING =======");
        System.out.println("Nama Course :" + getCourseName());
        System.out.println("Ruangan Ke :" + getRoom());
        System.out.println(getSks());
        if (this.sks > 100) {
            System.out.println("Gelar : SPD");
        } else {
            System.out.println("Gelar : Belum Mmemenuhi Syarat Nilai");
        }
    }


}
