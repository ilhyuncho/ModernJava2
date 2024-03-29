package Serialize.ByteArrayOutputStream;

import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private String email;

    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;
}
