import Week2.*;
import week1.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // student file assignement-1
        Student student = new Student();
        student.setName("rishika priya");
        String name = student.getName();
        System.out.println("Student name: " + name);


    //    SubDepartment subDepartment=new SubDepartment(10);
     //   int departmentSize = subDepartment.getDepartmentSize();
      //  System.out.println("Sales Department Size: " + departmentSize);

// product file for assignement 2 question 2
        Product p=new Product();
        p.setPrice(12);
        double d=p.getPrice(4);
        System.out.println("price"+d);

//dress file for assignment 2 question 3
        dress dress1 = new jeans();
        dress dress2 = new skirts();

        dress1.dresstype();
        dress2.dresstype();


        System.out.println("week 1 day 5,4");
// calling branch class assignment 3 question 1
      ParentChild pc=new ParentChild();
      pc.setName("rishika");
      String name2 =pc.getmothername();
      System.out.println("Name:"+name2);

//calling a child and parent class created a constructors assignment 3 quest 2
        Parent parent = new Parent(50);
        Child child1 = new Child(25, 25);
        Child child2 = new Child(27);

        System.out.println("parent var: " + parent.father);
        System.out.println("Child1 var  " + child1.getChildVar());
        System.out.println("Child2 var " + child2.getChildVar());

//assignment 3 quest 3
     System.out.println("the employee no is:"+MyClass.printno());

//assignment 3 quest 4        
        MyFinal c = new MyFinal();
        System.out.println("Addition of Number1 and Number 2 is : "+c.add(5));
System.out.println("************ WEEK 2 DAY 1 ASSIGNMENTS: *************");
//week2 day 1
        Reverse r=new Reverse();
        r.reverseNum();
        //System.out.println("reverse number is"+r.reverseNum);
//week2 day 1
        Age a= new Age();
        a.PersonAge();
//week 2 day 1
fibonacci f=new fibonacci();
f.fib();

//week2 day 1
        FizzBuzz fb=new FizzBuzz();
        fb.fib();
    }
}