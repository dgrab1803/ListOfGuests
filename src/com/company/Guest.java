package com.company;

public class Guest {

    private String name;
    private String lastName;
    private int phoneNumber;
    private String meal;
    private boolean isVegan;


    public Guest(String name, String lastName, int phoneNumber, String meal, boolean isVegan) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.meal = meal;
        this.isVegan = isVegan;


    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getMeal() {
        return meal;
    }

    public boolean isVegan() {
        return isVegan;
    }
    public void displayGuestsInformation(){

        System.out.println("imie : " + getName() + "  Nazwisko : " + getLastName() + "  Numer telefonu : " + getPhoneNumber() );
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println(" Czy jest weganinem? " + isVeganString);

    }
}
