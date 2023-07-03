package Week2;

public class fibonacci {
    int N=10;
    public void fib(){
        System.out.print("fibbonacci series for N=10 is:    ");
        for(int i=0;i<N;i++){
            System.out.print(fibo(i)+"");
        }
    }
    public static int fibo(int f){
        if(f<=1){
            return f;
        }else {
            return fibo(f-1)+fibo(f-2);
        }
    }
}
