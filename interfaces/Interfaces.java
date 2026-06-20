package interfaces;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Birds fly");
    }
}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Planes fly");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Bird b = new Bird();
        Plane p = new Plane();
        b.fly();
        p.fly();
    }
}