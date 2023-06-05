package Final;

final class MyFinalClass {
    final int myFinalVariable = 10;

    final void myFinalMethod() {
        System.out.println("This is a final method in MyFinalClass.");
    }
}

class AnotherClassInSamePackage {
    public static void main(String[] args) {
        MyFinalClass myFinalObj = new MyFinalClass();
        System.out.println("Final Variable: " + myFinalObj.myFinalVariable);
        myFinalObj.myFinalMethod();
    }
}