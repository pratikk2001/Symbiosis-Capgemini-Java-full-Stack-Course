class Student{

    private String name;
    private int age;

        public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

        public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.displayDetails();
		
		Student stud2 = new Student("Pratik", 23);
        stud2.displayDetails();
    }
}