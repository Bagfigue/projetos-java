package aulas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main (String [] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		System.out.println(list.size());
		
		for (String x: list) {
			System.out.println(x);
		}
	}
}
