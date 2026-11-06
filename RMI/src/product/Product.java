package product;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Product extends Remote {

    public String getname() throws RemoteException;

    public String getDescription() throws RemoteException;

    public double getPrice() throws RemoteException;

}