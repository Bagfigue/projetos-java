package rmi3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceObjRemoto extends Remote {

    public String processar(double numero1, double numero2, String mensagem)
            throws RemoteException;

}