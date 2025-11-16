package Java_OOPs_and_Exception_Handling_Test;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
