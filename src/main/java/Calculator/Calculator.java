package Calculator;

public class Calculator {

    private int a = 0;
    private int b = 0;

    Calculator(){

    }
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public double divide() {
        return (double) a / b;
    }



}
