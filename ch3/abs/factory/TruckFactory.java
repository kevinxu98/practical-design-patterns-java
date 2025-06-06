package ch3.abs.factory;

class TruckFactory extends AbstractFactory{

    @Override
    public Vehicle createVehicle(Object truckName) {
        return switch (truckName) {
            case TruckNames.LIGHT -> new LightTruck();
            case TruckNames.HEAVY -> new HeavyTruck();
            default -> throw new IllegalArgumentException(String.format("This is type %s", truckName));
        };
    }
}