class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class Keyword2 {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setAge(20);
        obj1.setName("Antima");

        System.out.println(obj1.getAge() + " : " + obj1.getName() + ":");

    }
}
