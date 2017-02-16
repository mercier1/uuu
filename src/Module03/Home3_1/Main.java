package Module03.Home3_1;

public class Main {
    public static void main(String... args) {
        Bird bird1 = new Bird("voody");
        bird1.sing();
        System.out.println();
        Bird bird = new Bird();
        bird.sing();
    }
}

class Bird {
    private String name;

    public Bird() {
    }

    public void sing() {
        System.out.println("I am walking");
        System.out.println("I am flying");
        System.out.println("I am singing");
        System.out.println("I am Bird");
    }

    public Bird(String name) {
        if (name == "voody")
            System.out.println("I am walking " + name);
    }
}