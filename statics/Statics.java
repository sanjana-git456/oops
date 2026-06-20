package statics;

class Student {
    String name;
    static String collegeName = "KJ Somaiya";
    Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println(name + " - " + collegeName);
    }
}

public class Statics {
    public static void main(String[] args) {
        Student s1 = new Student("Sanjana");
        Student s2 = new Student("Abc");

        Student.collegeName = "Updated college";
        s1.display();
        s2.display();
    }
}
