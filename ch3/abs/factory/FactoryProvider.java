package ch3.abs.factory;

class FactoryProvider {

    private FactoryProvider(){}

    static AbstractFactory getFactory(FactoryNames type) {
        return switch (type) {
            case FactoryNames.CAR -> new CarFactory();
            case FactoryNames.TRUCK -> new TruckFactory();
            default -> throw new IllegalArgumentException("This is %s".formatted(type));
        }
    }
}