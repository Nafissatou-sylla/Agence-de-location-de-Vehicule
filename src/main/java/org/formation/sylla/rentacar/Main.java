package org.formation.sylla.rentacar;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws carException, driveException {
//		Agency agency = new Agency("Agence auto", "Marseille");
//		Client client = new Client("SYLLA", "Nafissatou", 2000);
//		Motor motor = new Motor();
//		Cylinder cylinder = new Cylinder(12);
//		Car car = new Car();
//		
//		agency.addAClient(client);
//		agency.giveCar(client);
//		
//		client.driveCar(car);
//		
		
		
		
		Path path = Paths.get("clientFile");
		try(OutputStream out = Files.newOutputStream(path)){
			ObjectOutputStream oos = new ObjectOutputStream(out);
			Client client = new Client("SYLLA", "Nafi",19);
			oos.writeObject(client);
		}
		
		catch(IOException e) {
			System.err.println(e);
		}
	}
	
	
	

}

