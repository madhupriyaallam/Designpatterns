package DesignPatterns.Singleton;

public class safePerformanceCheck {
    private static safePerformanceCheck ins1;
    //private static readonly object ob = new object();
    private safePerformanceCheck(){}
    public static safePerformanceCheck getInstance()
    {
        if(ins1 == null)
        {
            ins1 = new safePerformanceCheck();
        }
        return ins1;
    }
}
//https://www.adevguide.com/prototype-design-pattern-java
