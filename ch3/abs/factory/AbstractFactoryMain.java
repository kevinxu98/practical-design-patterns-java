package ch3.abs.factory;

public class AbstractFactoryMain {

    public static void main(String[] args){
        System.out.println("Factory Pattner: ");
        AbstractFactory carFactory = FactoryProvider.getFactory(FactoryNames.CAR);
        AbstractFactory truckFactory = FactoryProvider.getFactory(FactoryNames.TRUCK);
        Vehicle fastCar = carFactory.createVehicle(CarNames.FAST);
        Vehicle heavyTruck = truckFactory.createVehicle(TruckNames.HEAVY);
        fastCar.move();
        heavyTruck.move();
        
    }
}