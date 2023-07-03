package Week2;

public class Stringrotate {
    public static boolean stringrot(String st1, String st2){
        return ((st1.length()==st2.length())&&((st1+st1).indexOf(st2)!=-1));
    }
}
