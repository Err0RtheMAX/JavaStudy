package 중첩클래스;

public class MainB {
    public static void main(String[] args) {
        Outter2 outter2 = new Outter2();

        Outter2.Nested nested = outter2.new Nested();

        nested.print();
    }
}
