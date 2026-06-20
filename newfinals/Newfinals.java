package newfinals;

class Parent {
    final void show() {
        System.out.println("Parent method");
    }
}

// class Child extends Parent {
//     void show() {
//         System.out.println("Child method");
//     }
// }

public class Newfinals {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
    }
}
