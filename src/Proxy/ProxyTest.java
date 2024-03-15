package Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        TargetInterface targetInterface = new TargetImpl();
        Proxy proxy = new Proxy(targetInterface);

        Client client= new Client(proxy);
        client.exec();


        Proxy1 proxy1 = new Proxy1(targetInterface);

        Client client1 = new Client(proxy1);
        for (int i = 0; i < 4; i++) {
             client1.exec1();
        }

    }
}
