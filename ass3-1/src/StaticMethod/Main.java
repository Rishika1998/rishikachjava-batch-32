package StaticMethod;

class MyClass {
    private static int myStaticVariable;

    static {
        myStaticVariable = initializeStaticVariable();
    }

    public static int initializeStaticVariable() {
        // Perform some dynamic calculations or operations
        int result = 100; // Example value

        return result;
    }

    public static int getStaticVariable() {
        return myStaticVariable;
    }
}

public class Main {
    public static void main(String[] args) {
        int staticVariable = MyClass.getStaticVariable();
        System.out.println("Static Variable: " + staticVariable);
    }
}

