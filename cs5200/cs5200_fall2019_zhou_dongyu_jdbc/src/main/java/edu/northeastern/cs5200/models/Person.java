package edu.northeastern.cs5200.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private Date dob;
    private Collection<User> users;

    {
        users = new ArrayList<User>();
    }
    private Collection<Developer> developers;

    {
        developers = new ArrayList<Developer>();
    }
    public Person() {
    }
    private Collection<Phone> phones;

    {
        phones = new ArrayList<Phone>();
    }
    private Collection<Address>addresses;

    {
        addresses = new ArrayList<Address>();
    }


    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    public Collection<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Collection<Developer> developers) {
        this.developers = developers;
    }
    public void addPhone(Phone phone){
        phones.add(phone);
    }
    public void removePhone(Phone phone){
        phones.remove(phone);
    }

    public Collection<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Collection<Phone> phones) {
        this.phones = phones;
    }
    public void addAddresses(Address address){
        addresses.add(address);
    }
    public void removeAddress(Address address){
        addresses.remove(address);
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
