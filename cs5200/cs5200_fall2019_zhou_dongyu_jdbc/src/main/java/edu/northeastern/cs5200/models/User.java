package edu.northeastern.cs5200.models;

public class User extends Person {

    private boolean userAgreement;
    private Person person;


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isUserAgreement() {
        return userAgreement;
    }

    public boolean getUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(boolean userAgreement) {
        this.userAgreement = userAgreement;
    }

    public User() {
    }
    public User(int id, String firstName, String lastName) {
        Person person= new Person();
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
    }
}
