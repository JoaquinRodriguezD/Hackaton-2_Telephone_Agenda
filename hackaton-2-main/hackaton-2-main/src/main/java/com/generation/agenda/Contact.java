package com.generation.agenda;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Contact {
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public Contact(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Contact contact = (Contact) o;
		return Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName)
				&& Objects.equals(phoneNumber, contact.phoneNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, phoneNumber);
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ": " + phoneNumber;
	}

	public static void listarContactos(HashSet<Contact> contactList) {
		System.out.println("\n--- Lista de Contactos ---");
		if (contactList.isEmpty()) {
			System.out.println("No hay contactos registrados");
		} else {
			contactList.forEach(System.out::println);
		}
		System.out.println("--------------------------");
	}

	public static Boolean existeContacto(HashSet<Contact> contactList, Scanner s) {
		System.out.println("\n--- Verificar Contacto ---");
		System.out.print("Ingrese nombre: ");
		String firstName = s.nextLine();
		System.out.print("Ingrese apellido: ");
		String lastName = s.nextLine();
		boolean exists = false;
		for (Contact c : contactList) {
			if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {

				System.out.println("El número de " + firstName + " " + lastName + " es " + c.phoneNumber);
				System.out.println("--------------------------");
				exists = true;
				break;
			}
		}
		System.out.println("El contacto " + firstName + " " + lastName + " no existe");
		System.out.println("--------------------------");
		return exists;
	}

	// metodo 5 eliminar contacto
	public static boolean eliminarContacto(HashSet<Contact> contactList, Contact c) {
		if (contactList.remove(c)) {
			System.out.println("Contacto " + c.getFirstName() + " " + c.getLastName() + " eliminado correctamente.");
			return true;
		} else {
			System.out.println("El contacto " + c.getFirstName() + " " + c.getLastName() + " no existe en la agenda.");
			return false;
		}
	}

	// metodo 6 modificar telefono
	public static void modificarTelefono(String nombre, String apellido, String nuevoTelefono,
			HashSet<Contact> contactList, Scanner s) {

		if (existeContacto(contactList, s) == true) {
			Contact nuevoContacto = new Contact(nombre, apellido, nuevoTelefono);

			contactList.remove(contactoExistente);
			contactList.add(nuevoContacto);
			System.out.println("Teléfono actualizado correctamente para " + nombre + " " + apellido);
		} else {
			System.out.println("El contacto " + nombre + " " + apellido + " no existe en la agenda.");
		}
	}
}