package Proxy;

public class Proxy1 implements TargetInterface {
    private final TargetInterface targetInterface;
    private String data;

    public Proxy1(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    @Override
    public void run() {

    }

    @Override
    public String run1() {
        if( data == null)
        {
            data = targetInterface.run1();
        }
        return data;
    }
}
