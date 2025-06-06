package ch3.abs.factory;

class CarFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle(Object carName){
        return switch (carName) {
            case CarNames.SLOW -> new SlowCar();
            case CarNames.FAST -> new FastCar();
            default -> throw new IllegalArgumentException(String.format("This is type %s.", carName));
        };
    }
}