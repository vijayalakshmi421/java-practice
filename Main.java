import java.util.*;

class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}

class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    void addStudent(String name, int rollNumber, int marks) {
        students.add(new Student(name, rollNumber, marks));
        System.out.println("Student Added Successfully!");
    }

    // Remove Student
    void removeStudent(int rollNumber) {
        for (Student s : students) {
            if (s.rollNumber == rollNumber) {
                students.remove(s);
                System.out.println("Student Removed!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // Search Student
    void searchStudent(int rollNumber) {
        for (Student s : students) {
            if (s.rollNumber == rollNumber) {
                System.out.println("Found: " + s.name + " | Marks: " + s.marks);
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // Display All
    void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No Students Available");
            return;
        }
        for (Student s : students) {
            System.out.println(s.name + " | Roll: " + s.rollNumber + " | Marks: " + s.marks);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    sm.addStudent(name, roll, marks);
                    break;

                case 2:
                    System.out.print("Enter Roll Number to Remove: ");
                    sm.removeStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    sm.searchStudent(sc.nextInt());
                    break;

                case 4:
                    sm.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
