package week4;
import java.util.*;
public class Hashstudent {

        public static void main(String[] args) {
            Map<String, student> map = new HashMap<>();
            map.put("rishika", new student("rishika", "c", 3.9));
            map.put("minni", new student("minni", "c", 3.8));
            map.put("snefalika", new student("snefalika", "g", 3.5));
            map.put("satyam", new student("satyam", "ch", 4.0));
            map.put("Ajitha", new student("Ajitha", "pindi", 3.4));
            map.put("vamshi", new student("vamshi", "gprj", 4.0));
            map.put("adyth", new student("adyuth", "makkeena", 3.9));
            map.put("deva", new student("deva", "p", 3.8));
            System.out.println("Printing using keySet and Iterator:");
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                student stu = map.get(key);
                System.out.println("Key: " + key + "; Value: " + stu.constr());
            }
            System.out.println();
            System.out.println("Printing using forEach method:");
            map.forEach((key, value) -> System.out.println("Key: " + key + "; Value: " + value.constr()));
            System.out.println();
            System.out.println("Printing using Entry Set:");
            for (Map.Entry<String, student> entry: map.entrySet())
                System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue().constr());
        }
    }
    class student {
        String FirstName;
        String LastName;
        double GPA;
        student(String FirstName, String LastName, double GPA) {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.GPA = GPA;
        }
        public String constr(){
            return "[FirstName = " + FirstName + ", LastName = " + LastName + ", GPA = " + GPA + "]";
        }
    }

