package DesignPatterns.Factory;

public class factory
{
    public static void main(String args[]){
        String mode1 = "bus";
        Modefactory modefactory1 = new Modefactory();
        anytravel at1 = modefactory1.createFactory(mode1);
        at1.setName("Madhu");
        at1.setOrigin("Hyderabad");
        at1.setDestination("Delhi");
        at1.travelMode(mode1);
        String mode2 = "car";
        Modefactory modefactory2 = new Modefactory();
        anytravel at2 = modefactory2.createFactory(mode2);
        at2.setName("Sai");
        at2.setOrigin("Hyderabad");
        at2.setDestination("Vizag");
        at2.travelMode(mode2);
    }
}
