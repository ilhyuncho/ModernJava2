package Serialize;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        try{
            String filename = "UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(filename);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo2 u1 = new UserInfo2("jafdsf","3sdfs",3);
            UserInfo2 u2 = new UserInfo2("jafdsdfsdfsf","3sdfgdfgdfs",32);

            ArrayList<UserInfo2> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
