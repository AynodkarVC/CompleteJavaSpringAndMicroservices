package clases.CoreJava;

public class StaticKey {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile oj1 = new Mobile();
        oj1.brand = "Motorola";
        oj1.price = 25000;
        //oj1.name = "Edge40";

        Mobile oj2 = new Mobile();
        oj2.brand = "Samsung";
        oj2.price = 70000;
       // oj2.name = "S24";

        System.out.println(oj1.name);
        System.out.println(oj2.name);
        System.out.println(Mobile.name);

        Class.forName("clases.CoreJava.Mobile");
    }
}

class Mobile{
    String brand;
    int price;
    // Making Something as class variable,
    // Doesn't allow object creation.
    static String name;

    // Static block
    static {
        name = "phone";
        System.out.println("int static block");
    }
}