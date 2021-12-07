package rmi_package.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    private static final long sericalVersionUID = 1L;

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {

    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
        } catch (Exception ex) {

        }

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {

        }
    }
}
