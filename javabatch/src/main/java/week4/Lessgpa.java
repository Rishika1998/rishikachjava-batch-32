package week4;
import java.util.ArrayList;
public class Lessgpa {

    private String fname;
    private String lname;
    private float GPA;

    public Lessgpa(String fname, String lname, float GPA) {
        this.fname = fname;
        this.lname = lname;
        this.GPA = GPA;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

}