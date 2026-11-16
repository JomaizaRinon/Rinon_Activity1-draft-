public class Student {
    // Private attributes
    private String name;
    private String studentId;
    private double grade;

    // Constructor
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    // Setter for grade only
    public void setGrade(double newGrade) {
        grade = newGrade;
    }

    // Method to display info
    public void displayInfo() {
        System.out.printf("Name: %s | ID: %s | Grade: %.1f%n", name, studentId, grade);
    }

    // Main method
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Jomaiza Marielle Rinon", "2026-001", 92.0);
        Student student2 = new Student("Jomari Aizen Rinon    ", "2026-002", 88.0);

        // Change one student's grade using the setter
        student2.setGrade(89.5);

        // Display both
        student1.displayInfo();
        student2.displayInfo();
    }
}