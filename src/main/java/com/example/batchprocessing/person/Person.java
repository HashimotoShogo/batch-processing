package com.example.batchprocessing.person;

public class Person {

    private String lastName;
    private String firstName;
    private Long id;
    private String address;

    public Person(Long id, String firstName, String lastName,String address) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address=address;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(Long id){this.id = id; }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "lastName='" + lastName + '\'' + ", firstName='" + firstName + '\'' + ", address="+ address +'}';
    }
}
