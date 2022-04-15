package FirstPackage;

public class SecondClass {
    private int a;
    private int b;

    public SecondClass() {

    }

    public SecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setValue1(int value) {
        this.a = value;
    }

    public void setValue2(int value) {
        this.b = value;
    }

    public int getValue1() {
        return a;
    }

    public int getValue2() {
        return b;
    }

    public int multipleValues() {
        return a * b;
    }
}
