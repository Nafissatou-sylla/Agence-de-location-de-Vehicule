package org.formation.sylla.rentacar;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
		/**
		 * the list of car
		 */
		ArrayList<Car> listCars = new ArrayList<>();
		Car car1 = new Car("BMW", new Motor(10));
		Car car2 = new Car("Audi", new Motor(15));
		Car car3 = new Car("Mercedes", new Motor(14));
		
		listCars.add(car1);
		listCars.add(car1);
		listCars.add(car2);
		listCars.add(car3);

		Agency agenceSylla = new Agency("SyllaAgence", "Marseille");
		Agency agenceNafi = new Agency("NafiAgence", "Marseille");
		
		
		/**
		 * add the car in the agency
		 */
		for (Car car : listCars) {
			agenceSylla.addCar(car);
		}

		
		/**
		 * the list of agency
		 */
		ArrayList<Agency> listAgencies = new ArrayList<>();
		listAgencies.add(agenceNafi);
		listAgencies.add(agenceSylla);
		

		/**
		 * the clients
		 */
	   Client clientNafi = new Client("Nafi", "sylla", 20);
	   Client clientAli = new Client("Ali", "sylla", 18);
	   Client clientBob = new Client("Bob", "sylla", 25);
	   
	   
	   /**
	    * test the method giveCar in Agency and rentACar in Client
	    */
	   
	   try {
			agenceSylla.giveCar(clientBob, car3);
		} 
	   catch (CarAlreadyRentedException | CarNotInTheAgencyException | ClientAlreadyRentedACarException e1) {
			e1.printStackTrace();
		}
	   
	   
	   
	   try {
		clientBob.rentACar(car3, listAgencies);
		} 
	   catch (CarAlreadyRentedException | CarNotInTheAgencyException | ClientAlreadyRentedACarException e2) {
			e2.printStackTrace();
		}
	   
	 
	   System.out.println(agenceSylla.toString());
	   System.out.println(clientBob.toString() + "\n");
	   
	 
	   /**
	    * test the oil level
	    */
	   try {
		clientBob.driveCar();
	} catch (DriveException e1) {
		e1.printStackTrace();
	}
	  
	   /**
	    * test if the car is returned
	    */
	   clientBob.returnCar(car3);
	   agenceSylla.clientReturnedTheCar(clientBob ,car3);
	   
	   System.out.println(agenceSylla.toString());
	   System.out.println(clientBob.toString() + "\n");
	   
	   
	   /**
	    * test if the client can drive without a car
	    */
//	   try {
//		clientBob.driveCar();
//	} catch (DriveException e1) {
//		e1.printStackTrace();
//	}
	 
	 
	   
	   
		/**
		 * Serializable Client
		 */
		Path pathClient = Paths.get("clientFile");
		try(OutputStream out = Files.newOutputStream(pathClient)){
			ObjectOutputStream oos = new ObjectOutputStream(out);
			Client client = new Client(" SYLLA ", " Nafi ",19);
			oos.writeObject(client);
		}
		
		catch(IOException e) {
			System.err.println(e);
		}
		
		
		/**
		 * Serializable Agency
		 */
		Path pathAgency = Paths.get("AgencyFile");
		try(OutputStream out = Files.newOutputStream(pathAgency)){
			ObjectOutputStream oos = new ObjectOutputStream(out);
			Agency agency = new Agency(" AgenceSylla ", " Marseille ");
			oos.writeObject(agency);
		}
		
		catch(IOException e) {
			System.err.println(e);
		}
	}
}

