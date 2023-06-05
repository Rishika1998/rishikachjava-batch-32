package assignment3;
    interface cse{
        void computer();
    }

    interface ece{
        void electronic();
    }

    class Myclass implements cse, ece {
        public void computer(){
            System.out.println("cse means computer science and engineering");
        }
        public void electronic(){
            System.out.println("ece means electrical and electronic engineering");
        }
    }

    public class Main{
        public static void main(String[] args){
            Myclass myclass=new Myclass();
            myclass.computer();
            myclass.electronic();
        }
    }
