package Week2;

public class Reverse {

    int num=12345;
    public int reverseNum=0;
    public void reverseNum() {
        while (num != 0) {
            int rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num = num / 10;
        }

        System.out.println("reverse of a given number is:   " + reverseNum);
    }
}
