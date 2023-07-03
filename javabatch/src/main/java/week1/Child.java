package week1;

public class Child extends Parent {
    public int childVar;
    public Child(int parentVar, int childVar) {
        super(parentVar);
        this.childVar = childVar;
    }

    public Child(int childVar) {
        super(0);
        this.childVar=childVar;
    }
    public int getChildVar(){
        return childVar;
    }
}
