package ch3.abs.factory;

public class AbstractFactoryMain {

    public static void main(String[] args){
        System.out.println("Factory Pattner: ");
        AbstractFactory carFactory = FactoryProvider.getFactory("car");
    }
}