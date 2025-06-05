package ch1.apie;


class Car {

  public static void main(String[] args){
    SportCar sportCar = new SportCar();
    CommonCar commonCar = new CommonCar();
    commonCar.move();
    sportCar.move();
  }
}