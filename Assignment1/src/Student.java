public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("rishika priya");
        String name = student.getName();
        System.out.println("Student name: " + name);
    }
}
