package BasicJava.TinyPrograms;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

}

public class StudentCollectionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n=== Student Menu ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");

            System.out.println("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); //consume newline

                    System.out.println("Enter student Name: ");
                    String name = sc.nextLine();

                    students.add(new Student(id, name));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }

                    }


                    break;

                case 3:
                    System.out.println("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id ==removeId) {

                            students.remove(i);
                             removed = true;

                        System.out.println(("Student removed."));
                        break;
                    }
            }


        if (!removed) {
            System.out.println("Student not found.");
        }
        break;

        case 4:
        System.out.println("Exiting...");
        sc.close();
        return;

        default:
        System.out.println("Invalid option.");
    }

}


    }

}
