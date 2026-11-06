package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import product.Product;

public class Client {

	public static void main (String [] args) {
		try {
			

			
			//locate the registry
			Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
			
			//get the reference of exported object from RMI registry
			Product laptop = (Product) registry.lookup("l");
			Product mobile = (Product) registry.lookup("m");
			Product charger = (Product) registry.lookup("c");
			Product bike = (Product) registry.lookup("b");
			
			//now we can invoke the method of the referenced objects
			System.out.println("The name of the laptop is " +laptop.getname());
			System.out.println("The description is " +laptop.getDescription());
			System.out.println("The price is " +laptop.getPrice());
			
			System.out.println("The name of the mobile is " +mobile.getname());
			System.out.println("The description is " +mobile.getDescription());
			System.out.println("The price is " +mobile.getPrice());
			
			System.out.println("The name of the charger is " +charger.getname());
			System.out.println("The description is " +charger.getDescription());
			System.out.println("The price is " +charger.getPrice());
			
			System.out.println("The name of the bike is " +bike.getname());
			System.out.println("The description is " +bike.getDescription());
			System.out.println("The price is " +bike.getPrice());
			
		}catch (Exception e) {
			System.out.println("Client side error ..." +e);
			
		}
	}
}
