package Week2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;


public class Csv {
    public static void file() throws FileNotFoundException {

        File f = new File("D://cis//workspace//rishikachjava-batch-32//javabatch//asscis.csv");
        Scanner s = new Scanner(f);
        String line;

        stud[] stu = new stud[10];
        for (int i = 0; s.hasNextLine(); i++) {
            line = s.nextLine();
            String[] str = line.split(",");
            String firstName = str[0];
            String lastName = str[1];
            float gpa = Float.parseFloat(str[2]);
            stu[i] = new stud(firstName,
                    lastName,
                    (float) gpa);

        }

        sort(stu);//dgfdfgf;

        for (int i = 0; i < 10; i++) {
            System.out.println(stu[i]);
        }
    }

    }
