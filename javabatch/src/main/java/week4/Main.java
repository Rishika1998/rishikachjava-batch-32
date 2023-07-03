package week4;

import week1.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Lessgpa> studentList = new ArrayList<>();
        Lessgpa stud1= new Lessgpa("rishika","c",5);
        Lessgpa stud2= new Lessgpa("chinnu","ch",4);
        Lessgpa stud3= new Lessgpa("pathi","r",2);
        Lessgpa stud4= new Lessgpa("vam","g",3);
        Lessgpa stud5= new Lessgpa("ady","m",5);

        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);
        studentList.add(stud4);
        studentList.add(stud5);
        float sum= 0;
        for (Lessgpa student : studentList)
            sum+= student.getGPA();
        float avg=sum/studentList.size();

        for (Lessgpa student : studentList) {
            if (student.getGPA() > avg) {
                System.out.println(student.getFname()+"  "+student.getLname()+" "+student.getGPA());
            }
        }

    }

}
