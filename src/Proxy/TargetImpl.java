package Proxy;

public class TargetImpl implements TargetInterface    {
    @Override
    public void run() {
        System.out.println("TargetImpl.run() 실행");
    }
    @Override
    public String run1() {
        System.out.println("TargetImpl run1() 호출ㄴ");
       return "proxydfsdf";
    }
}
