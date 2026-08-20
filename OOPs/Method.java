// Method overloading
class Calculator {
    int num; // instance variables(used in class)

    public int add(int n1, int n2) // local varibles(used in method)
    {
        num = 5;
        return n1 + n2;
    }

    // Same method with diffrent parameters
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Diffrent type of parmter with same method
    public double add(double n1, double n2) {
        return n1 + n2;
    }

}

public class Method {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println(result);
    }
}
