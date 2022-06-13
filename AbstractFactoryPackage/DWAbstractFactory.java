package DesignPatterns.AbstractFactoryPackage;

public abstract class DWAbstractFactory {
    abstract DW getDW(String type);
}
class DWClass extends DWAbstractFactory{
    @Override
    DW getDW(String type) {
        if (type.equals("Doors")) {
            return new Doors();
        } else if (type.equals("Windows")) {
            return new Windows();
        }
        return null;
    }
}
