package Module03.Home3_2;

public class Arithmetic {
    public int add(Integer a, Integer b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(4, 4));
        System.out.println(adder.check(9, 7));
    }
}
