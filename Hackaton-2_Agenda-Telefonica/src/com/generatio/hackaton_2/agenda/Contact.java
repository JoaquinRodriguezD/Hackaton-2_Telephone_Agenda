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
}