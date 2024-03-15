package Serialize;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperUserInfo{
    String name;
    String password;

    SuperUserInfo(){
        this("sdfsdf","fsdfsdf");
    }

    public SuperUserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
public class UserInfo2 extends SuperUserInfo implements Serializable {
    int age;

    public UserInfo2(){
        this("fsdfsdf", "gdfgdfg", 0);
    }
    public UserInfo2(String name, String password, int age ) {
        super(name, password);
        this.age = age;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(password);
        out.defaultWriteObject();
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        password = in.readUTF();
        in.defaultReadObject();
    }

    @Override
    public String toString() {
        return "UserInfo2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
