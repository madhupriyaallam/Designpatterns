package DesignPatterns.Factory;

public class Modefactory {
    public anytravel createFactory(String mode)
    {
        if("bus".equals(mode)){
            return new bybus();
        }
        else if("car".equals(mode)){
            return new bycar();
        }
        else if("train".equals(mode)){
            return new bytrain();
        }
        else if("flight".equals(mode)){
            return new byflight();
        }
        else{
            return null;
        }
    }
}
