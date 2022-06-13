package DesignPatterns.Singleton;

public class Singleton {
    public static void main(String args[]) {
        unsafePerformanceCheck k = unsafePerformanceCheck.getInstance();
        System.out.println(k.hashCode());
        safePerformanceCheck k1 = safePerformanceCheck.getInstance();
        System.out.println(k1.hashCode());
        safePerformanceCheck k2 = safePerformanceCheck.getInstance();
        System.out.println(k2.hashCode());
    }
}
