package com.generatio.hackaton_2.agenda;
import java.util.Objects;

class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
               Objects.equals(lastName, contact.lastName) &&
               Objects.equals(phoneNumber, contact.phoneNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumber);
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + phoneNumber;
    }

    //metodo5
    public static boolean eliminarContacto(Contact c) {
        if (contactList.remove(c)) {
            System.out.println("Contacto " + c.getFirstName() + " " + c.getLastName() + " eliminado correctamente.");
            return true;
        } else {
            System.out.println("El contacto " + c.getFirstName() + " " + c.getLastName() + " no existe en la agenda.");
            return false;
        }
    }
    //metodo 6 modificar telefono
    // :
    public static void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
        // Buscamos el contacto existente
        Contact contactoExistente = buscarContacto(nombre, apellido);

        if (contactoExistente != null) {
            // Creamos nuevo contacto con mismo nombre/apellido pero nuevo teléfono
            Contact nuevoContacto = new Contact(nombre, apellido, nuevoTelefono);

            // Eliminamos el viejo y añadimos el nuevo
            contactList.remove(contactoExistente);
            contactList.add(nuevoContacto);
            System.out.println("Teléfono actualizado correctamente para " + nombre + " " + apellido);
        } else {
            System.out.println("El contacto " + nombre + " " + apellido + " no existe en la agenda.");
        }
    }

}




