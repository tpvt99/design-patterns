package rmi_package.client;

import java.rmi.*;

import rmi_package.server.MyRemote;

public class MyRemoteClient {
    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyRemoteClient client = new MyRemoteClient();
        client.go();
    }
}
