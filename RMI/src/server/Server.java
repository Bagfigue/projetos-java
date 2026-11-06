package server;

import product.Product;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
	public static void main (String [] arg) {
		try {
			
			//set hostname for the server using JavaProperty
			System.setProperty("java.rmi.server.hostname", "127.0.0.1");	
			System.out.println("Server has been started...");
			
			//product object
			ProductImpl p1 = new ProductImpl ("Laptop", "lenovo laptop", 1250.5);
			ProductImpl p2 = new ProductImpl ("Mobile", "Mi mobile", 340.5);
			ProductImpl p3 = new ProductImpl ("Power Charger", "lenovo charger", 240.3);
			ProductImpl p4 = new ProductImpl ("MotorBike", "Yamaha Biker", 38000.5);
			
			
			//export products object using UnicastRemoteObject class			
			Product stub1 = (Product) UnicastRemoteObject.exportObject(p1, 0);
			Product stub2 = (Product) UnicastRemoteObject.exportObject(p2, 0);
			Product stub3 = (Product) UnicastRemoteObject.exportObject(p3, 0);
			Product stub4 = (Product) UnicastRemoteObject.exportObject(p4, 0);
			
			//register the exported class in RMI registry with name,
			//client will use that name to get the reference of these exported objects
			
			
			
			// creates registry
			Registry registry = LocateRegistry.createRegistry(9100);

			registry.rebind("l", stub1);
			registry.rebind("m", stub2);
			registry.rebind("c", stub3);
			registry.rebind("b", stub4);

			System.out.println("Exporting and bindinng of objects has been completed ...!");
			
			
		} catch (Exception e) {
			System.out.println("Some server error ..." + e);
		}
	}
}
