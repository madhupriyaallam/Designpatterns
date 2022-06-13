package DesignPatterns.Singleton;

public class unsafePerformanceCheck {
    private static unsafePerformanceCheck ins;
    private unsafePerformanceCheck(){}
    public static unsafePerformanceCheck getInstance()
    {
        if(ins == null)
        {
            ins = new unsafePerformanceCheck();
        }
        return ins;
    }
}
