package week3;

public class CustomException extends Exception {
    public CustomException() {

    }
    public CustomException(String s) {
        super(s);
    }

    public void conversionToIntCustom(String s) {
        try {
            throw new CustomException("testing");
//            int i = Integer.parseInt(s);
//            System.out.println(i);
        } catch (Exception me) {
            System.out.println("Exception: Given input cannot be parsed to Integer");

}

}


}
