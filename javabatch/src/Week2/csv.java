package Week2;

import Week2.Stu;
import week1.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import static java.lang.Integer.parseInt;


public class csv{
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("D://cis//workspace//rishikachjava-batch-32//javabatch//asscis.csv");
        Scanner s = new Scanner(f);
        String line;

        Student[] st = new Student[10];
        for(int i = 0; s.hasNextLine(); i++){
            line= s.nextLine();
            String[] str = line.split(",");
            String firstName = str[0];
            String lastName = str[1];
            int gpa = parseInt(str[2]);
            st[i]= new Student();

        }

        Arrays.sort(st);

        Arrays.stream(st).forEach(System.out::println);

    }
}