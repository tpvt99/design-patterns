package rmi_gumball.server;

import rmi_gumball.entity.GumballMachine;
import rmi_gumball.entity.State;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineServer{

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
        } catch (Exception ex) {

        }
        try {
            GumballMachine gumballMachine = new GumballMachine("New York", 1);
            Naming.rebind("GumballHello", gumballMachine);
        } catch (Exception ex) {

        }
    }
}
