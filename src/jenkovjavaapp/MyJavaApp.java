package jenkovjavaapp;

import java.util.Arrays;


public class MyJavaApp {
  public static void main(String[] args) {

    Car car = new Car();
    System.out.println("New car created");
    System.out.println("Seats: " + car.getNumberOfSeats());
    System.out.println("License Plate: " + car.getLicensePlate());
    System.out.println("");
    System.out.println("---------------------------------");

    car.setLicensePlate("FZ 1078");
    System.out.println("Set license plate");
    System.out.println("License Plate: " + car.getLicensePlate());
    








  }
}