package Week2;

public class Stu {

    public static class Student implements Comparable<Student>{

        String fn;
        String ln;
        int gpa;

        public Student(String fn, String ln, int gpa) {
            this.fn = fn;
            this.ln = ln;
            this.gpa = gpa;
        }


        @Override
        public int compareTo(Student s) {
            return (this.ln).compareTo(s.ln);
        }

        @Override
        public String toString() {
            return this.fn+"  " +this.ln+"  " +this.gpa;
        }
    }
}
