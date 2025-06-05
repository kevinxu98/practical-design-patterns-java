package ch1.apie;

class CommonCar extends AbstractVehicle {

  public void move() {
    System.out.println("Common car extension...");
  }

  @Override
  public void stop(){
    System.out.println("Overidden from abstract vehicle class...");
  }

}