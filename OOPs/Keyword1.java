class Mobile {

    String brand;
    int price;
    static String colour; // use only when you want the same value for each obj for a particular section
    // String colour;

    public void show() {
        System.out.println(brand + ":" + price + ":" + colour);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + ":" + obj.price + ":" + obj.colour); // static method cannot acces
        // non static variable directly

    }

    static {
        colour = "Black";
        System.out.println("Static block"); // runs only ones when the class loads
        // also without any object the static block not run.
    }
}

public class Keyword1 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 20000;
        Mobile.colour = "Black";
        // obj1.colour = "Black";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 100000;
        Mobile.colour = "White";
        // obj2.colour = "White";

        Mobile obj3 = new Mobile();
        obj3.brand = "Xiaomi";
        obj3.price = 15000;
        Mobile.colour = "Red";
        // obj3.colour = "Red";

        // obj1.colour = "Pink"; // every object will get the pink colour

        obj1.show();
        obj2.show();
        obj3.show();

        Mobile.show1(obj2);

    }

}
