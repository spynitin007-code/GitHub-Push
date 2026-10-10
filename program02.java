
class Student {
    int rollNo;
    String name;
    double marks;

    // Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display object data
    void display() {
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class program02 {
    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student(101, "Rahul", 85.5);

        // Creating second object and copying contents of first object
        Student s2 = new Student(s1.rollNo, s1.name, s1.marks);

        System.out.println("Contents of First Object:");
        s1.display();

        System.out.println("\nContents of Second Object:");
        s2.display();
    }
}