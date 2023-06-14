package week3;

public class ThreadClass extends Thread{

    @Override
    public void start() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    }
