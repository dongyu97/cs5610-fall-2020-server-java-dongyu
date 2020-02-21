package edu.northeastern.cs5200.models;

import java.util.Date;

public class Developer extends Person{
    private Person person;
    private String developerKey;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



    public Developer() {
    }

    public Developer(String developerKey,int id,String firstName, String lastName) {
        this.developerKey = developerKey;
        Person person= new Person();
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
    }
    public Developer(String developerKey, int id, String firstName, String lastName, String username, String email, Date dob) {
        this.developerKey=developerKey;
        person=new Person();
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setUserName(username);
        person.setEmail(email);
        person.setDob(dob);
    }
    public Developer(String developerKey,int id,String firstName,String lastName,String userName,String email,Date dob,String address,String phone) {
        this.developerKey=developerKey;
        person=new Person();
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setUserName(userName);
        person.setEmail(email);
        person.setDob(dob);
        person.addAddresses(new Address(address));
        person.addPhone(new Phone(phone));
    }

    public String getDeveloperKey() {
        return developerKey;
    }

    public void setDeveloperKey(String developerKey) {
        this.developerKey = developerKey;
    }
}
