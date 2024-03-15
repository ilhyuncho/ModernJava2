package Proxy;

public class Client {
    private final TargetInterface targetInterface;

    public Client(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    public void exec() {
        targetInterface.run();
    }

    public void exec1() {
        targetInterface.run1();
    }

}
