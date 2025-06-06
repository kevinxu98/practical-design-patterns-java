package ch3.abs.factory;


class HeavyTruck implements Vehicle {

    @Override
    public void move() {
        System.out.println("Heavy truck moving...");
    }
}