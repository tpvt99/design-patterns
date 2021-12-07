package rmi_gumball.client;


import rmi_gumball.server.GumballMachineRemote;

import java.rmi.Naming;

public class GumballMachineClient {
    public void go() {
        try {
            GumballMachineRemote service = (GumballMachineRemote) Naming.lookup("rmi://localhost/GumballHello");
            GumballMonitor monitor = new GumballMonitor(service);
            monitor.report();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GumballMachineClient client = new GumballMachineClient();
        client.go();
    }
}
