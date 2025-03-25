package com.generation;

import java.util.HashSet;
import java.util.Scanner;

import com.generation.agenda.Contact;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
		int option = 1;
		HashSet<Contact> contactList = new HashSet<>();

		contactList.add(new Contact("Juan", "Ro", "123-456-7890"));
		contactList.add(new Contact("Alberto", "R", "234-567-8901"));
		contactList.add(new Contact("Josefa", "R", "345-678-9012"));

		
    	System.out.println("\n--- Menú Agenda ---");
		System.out.println("1. Añadir contacto");
		System.out.println("2. Verificar existencia");
		System.out.println("3. Listar contactos");
		System.out.println("4. Buscar contacto");
		System.out.println("5. Eliminar contacto");
		System.out.println("6. Modificar teléfono");
		System.out.println("7. Agenda llena");
		System.out.println("8. Espacios libres");
		System.out.println("0. Salir");
		System.out.print("Opción: ");

		while (option != 0) {

			option = s.nextInt();
			s.nextLine();
			System.out.print("Eligé tu siguinte opción: ");
			
			switch (option) {
			case 1: {

				break;
			}
			case 2: {

				break;
			}
			case 3: {
				Contact.listarContactos(contactList);
				break;
			}
			case 4: {

				Contact.existeContacto(contactList, s);
				break;
			}
			case 5: {
				System.out.print("Ingrese nombre: ");
				String nombre = s.nextLine();
				System.out.print("Ingrese apellido: ");
				String apellido = s.nextLine();
				System.out.print("Ingrese teléfono: ");
				String telefono = s.nextLine();

				// Creamos el contacto temporal para buscar y eliminar
				Contact contactoAEliminar = new Contact(nombre, apellido, telefono);
				Contact.eliminarContacto(contactList, contactoAEliminar);
				break;
			}
			case 6: {
				System.out.print("Ingrese nombre: ");
				String nombre = s.nextLine();
				System.out.print("Ingrese apellido: ");
				String apellido = s.nextLine();
				System.out.print("Ingrese nuevo teléfono: ");
				String nuevoTelefono = s.nextLine();

				Contact.modificarTelefono(nombre, apellido, nuevoTelefono, contactList, s);
				break;
			}
			case 7: {

				break;
			}
			case 8: {

				break;
			}
			case 0: {
				System.out.println("Saliendo del programa...");
				break;
			}
			default:
				System.out.println("Opción no valida: " + option);
			}
		}
		s.close();
    }
}