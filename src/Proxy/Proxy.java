package Proxy;

import java.lang.annotation.Target;

public class Proxy implements TargetInterface{
    private final TargetInterface targetInterface;

    @Override
    public String run1() {
        return null;
    }

    public Proxy(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    @Override
    public void run() {
        System.out.println("Proxy.run().. before");
        targetInterface.run();
        System.out.println("Proxy.run().. after");
    }
}
