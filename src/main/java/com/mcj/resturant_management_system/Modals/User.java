
package com.mcj.resturant_management_system.Modals;


public class User {
    // Data members
    private int ID;
    private String Name;
    private String Password;
    private String Role;

    // Constructor
    public User(int ID, String Name, String Password, String Role) {
        this.ID = ID;
        this.Name = Name;
        this.Password = Password;
        this.Role = Role;
    }

    // Getters and Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    // Method to display user information (excluding password for security)
    public void displayUserInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Role: " + Role);
    }
}
