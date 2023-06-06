package Week2;

public class Age {
    int age=51;
    public void personAge() {
        if (age > 13 && age < 19) {
            System.out.println("the person is teen Age");
        } else if (age < 13) {
            System.out.println("The person is kid");
        } else if (age > 19) {
            System.out.println("The person is adult");
        }
    }
}
