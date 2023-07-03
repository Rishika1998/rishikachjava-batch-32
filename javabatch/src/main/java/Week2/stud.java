package Week2;

    public class stud implements Comparable<stud>{

        String fn;
        String ln;
        float gpa;

        public stud(String fn, String ln, float gpa) {
            this.fn = fn;
            this.ln = ln;
            this.gpa = gpa;
        }


        @Override
        public int compareTo(stud s) {
            return (this.ln).compareTo(s.ln);
        }

        @Override
        public String toString() {
            return this.fn+"  " +this.ln+"  " +this.gpa;
        }
    }

