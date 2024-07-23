class Person {
    void eat() {
        System.out.println("Person is eating");
    }

    void sleep() {
        System.out.println("Person is sleeping");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

public class SchoolExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.eat();
        teacher.teach();
        teacher.sleep();

        System.out.println(); // For spacing between outputs

        Student student = new Student();
        student.eat();
        student.study();
        student.sleep();
    }
}
