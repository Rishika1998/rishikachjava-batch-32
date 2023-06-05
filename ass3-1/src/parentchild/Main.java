package parentchild;

class Parent {
    protected int parentVar;

    public Parent(int parentVar) {
        this.parentVar = parentVar;
    }
}

class Child extends Parent {
    public int childVar;

    public Child(int parentVar, int childVar) {
        super(parentVar);
        this.childVar = childVar;
    }

    public Child(int childVar) {
        this(10, childVar); // Calling another constructor of the same class
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(10);
        Child child1 = new Child(20, 30);
        Child child2 = new Child(40);

        System.out.println("Parent Variable: " + parent.parentVar);
        System.out.println("Child1 Variables - Parent Variable: " + child1.parentVar + ", Child Variable: " + child1.childVar);
        System.out.println("Child2 Variables - Parent Variable: " + child2.parentVar + ", Child Variable: " + child2.childVar);
    }
}
