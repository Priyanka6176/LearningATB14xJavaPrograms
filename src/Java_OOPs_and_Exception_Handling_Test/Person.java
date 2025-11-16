package Java_OOPs_and_Exception_Handling_Test;

public class Person {

    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

