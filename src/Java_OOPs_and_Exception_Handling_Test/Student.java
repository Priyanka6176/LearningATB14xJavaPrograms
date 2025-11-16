package Java_OOPs_and_Exception_Handling_Test;

public class Student {
    String name;
    int rollNo;
    String section;


    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }


    void printDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}
