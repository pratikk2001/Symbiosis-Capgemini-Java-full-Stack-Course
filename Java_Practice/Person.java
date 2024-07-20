public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person(person1); // Copy constructor is called

        System.out.println(person1); // Outputs: Person{name='Alice', age=30}
        System.out.println(person2); // Outputs: Person{name='Alice', age=30}

        person2.setName("Bob");
        person2.setAge(25);

        System.out.println(person1); // Outputs: Person{name='Alice', age=30}
        System.out.println(person2); // Outputs: Person{name='Bob', age=25}
    }
}
