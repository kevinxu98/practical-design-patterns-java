package ch1.apie;

class SportCar extends AbstractVehicle {

  public void move() {
    System.out.println("Implement abstract method");
  }

  @Override
  public void stop() {
    System.out.println("Overriden method in sports car class");
  }
}