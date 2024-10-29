package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}
	public void getDetails() {
		System.out.println("Nombre: " + name);
		System.out.println("Apellido : " + surname);
		System.out.println("Especialización" + specialization);
	}
}
