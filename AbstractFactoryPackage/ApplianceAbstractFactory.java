package DesignPatterns.AbstractFactoryPackage;

public abstract class ApplianceAbstractFactory {
    abstract Appliances getAppliance(String applianceName);
}
class Electronic extends ApplianceAbstractFactory{

    @Override
    Appliances getAppliance(String applianceName) {
        if(applianceName.equals("AirConditioner")){
            return new AirConditioner();
        }
        else if(applianceName.equals("Fan")){
            return new Fan();
        }
        else if(applianceName.equals("WashingMachine")){
            return new WashingMachine();
        }
        return null;

    }
}