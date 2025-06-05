package ch1.apie;

abstract class AbstractVehicle implements VehicleInterface{
  public abstract void move();

  public void stop() {
    System.out.println("From abstract method...");
  }
}