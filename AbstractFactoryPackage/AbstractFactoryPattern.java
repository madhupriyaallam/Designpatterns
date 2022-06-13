package DesignPatterns.AbstractFactoryPackage;
import java.util.Scanner;
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter doors or windows");
        String type = keyboard.nextLine();
        System.out.println("Enter appliance names");
        String applianceName = keyboard.nextLine();
        String applianceName1 = keyboard.nextLine();
        ApplianceAbstractFactory aaf = FactoryProducer.getApplianceFactory();
        Appliances app = aaf.getAppliance(applianceName);
        app.status();
        Appliances app1 = aaf.getAppliance(applianceName1);
        app1.status();
        DWAbstractFactory dwf = FactoryProducer.getDWFactory();
        DW dw = dwf.getDW(type);
        dw.status1();
    }
}
