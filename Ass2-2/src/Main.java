public class Main {
    public static void main(String[] args) {

        Product p=new Product();
        p.setPrice(20);
        double d=p.getPrice(4);
        System.out.println("price"+d);
    }
}