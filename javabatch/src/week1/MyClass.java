package week1;

public class MyClass {
    private static int employeeno;

    public static int printno() {
        return employeeno;
    }

    static {
        employeeno = 10;
    }
}