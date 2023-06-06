package Week2;

public class FizzBuzz {
    int num=100;
    public void fib(){
        System.out.println(" ");
        System.out.println("fizzbuzz program:   ");
        for(int i=1;i<=num;i++)
        if(i%3==0 && i%5==0){
            System.out.println("Fizzbuzz");
            System.out.print("");
        } else if (i%3==0) {
            System.out.print("fizz");
        } else if (i%5==0) {
            System.out.print("Buzz");
        }else {
            System.out.print(i);
        }
    }
}
