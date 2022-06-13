package DesignPatterns.AbstractFactoryPackage;

public interface DW {
    void status1();
}
class Doors implements DW{
    @Override
    public void status1() {
        System.out.println("Doors get automated");
    }
}
class Windows implements DW{
    @Override
    public void status1() {
        System.out.println("Windows get automated");
    }
}