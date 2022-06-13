package DesignPatterns.AbstractFactoryPackage;

public interface Appliances {
    void status();
}
class AirConditioner implements Appliances{

    @Override
    public void status() {
            System.out.println("AirCondition gets automated");
    }
}
class Fan implements Appliances{

    @Override
    public void status() {
        System.out.println("Fan gets automated");
    }
}
class WashingMachine implements Appliances{

    @Override
    public void status() {
        System.out.println("Washing gets automated");
    }
}