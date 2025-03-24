package com.generatio.hackaton_2.agenda;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		/*
		 * HashSet<Contact> contactList = new HashSet<>();
		 * 
		 * contactList.add(new Contact("Juan", "Ro", "123-456-7890"));
		 * contactList.add(new Contact("Alberto", "R", "234-567-8901"));
		 * contactList.add(new Contact("Josefa", "R", "345-678-9012"));
		 * 
		 * contactList.add(new Contact("Juan", "R", "123-456-7890"));
		 */
		int option = 1;

		while (option != 0) {
			System.out.println("Qué deseas hacer?");
			System.out.println(
					"1-Añadir un contacto \n2.-Verificar existencia de un contacto \n3.-Listar contactos \n4.-Busca contacto \n5.-Eliminar contacto \n6.-Modificar teléfono \n7.-Agenda llena \n8.-Espacios libres");
			switch (option) {
			case 1: {

				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {

				break;
			}
			case 5: {

				break;
			}
			case 6: {

				break;
			}
			case 7: {

				break;
			}
			case 0: {
				
				break;
			}
			default:
				throw new IllegalArgumentException("Opción no valida ingresada: " + option);
			}
		}

		/*
		 * System.out.println("Lista de contactos:"); for (Contact contact :
		 * contactList) { System.out.println(contact); }
		 */
	}
}
