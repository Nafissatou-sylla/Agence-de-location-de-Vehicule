package org.formation.sylla.rentacar;

public class Main {

	public static void main(String[] args) throws carException, driveException {
		Agency agency = new Agency("Agence auto", "Marseille");
		Client client = new Client("SYLLA", "Nafissatou", 2000);
		Motor motor = new Motor();
		Cylinder cylinder = new Cylinder(12);
		Car car = new Car();
		
		agency.addAClient(client);
		agency.giveCar(client);
		
		client.driveCar(car);

	}

}
