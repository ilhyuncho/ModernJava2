package Serialize;

import java.io.*;
import java.util.ArrayList;

public class MainDeserialize {
    public static void main(String[] args) {
        try{
            String filename = "UserInfo.ser";
            FileInputStream fos = new FileInputStream(filename);
            BufferedInputStream bos = new BufferedInputStream(fos);
            ObjectInputStream in = new ObjectInputStream(bos);

            UserInfo2 u1 = (UserInfo2)in.readObject();
            UserInfo2 u2 = (UserInfo2)in.readObject();
            ArrayList list = (ArrayList)in.readObject();

            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);

            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
