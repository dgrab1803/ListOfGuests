package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Party {

   private List<Guest> guests = new ArrayList<>();
   private Map<Integer, Guest> phoneToGuest= new HashMap<>();
   private Set<String> meals = new HashSet<>();
   private Map<String, Guest> nameToGuest = new HashMap<>();
   Scanner scanner = new Scanner(System.in);

   public void addGuest () {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj imie");
       String name = scanner.nextLine();

       System.out.println("Podaj nazwisko");
       String lastName = scanner.nextLine();

       System.out.println("Podaj numer telefonu");
       int phoneNumber = Integer.valueOf(scanner.nextLine());

       System.out.println("Jaka potrawa?");
       String meal = scanner.nextLine();

       System.out.println("Czy jest weganinem? Y/N");
       String isVeganString = scanner.nextLine();
       boolean isVegan;

       if(isVeganString.equals("Y")){
           isVegan = true;
       }else{
           isVegan = false;
       }

       Guest guest = new Guest(name, lastName, phoneNumber, meal, isVegan);
       guests.add(guest);
       phoneToGuest.put(phoneNumber, guest);
       meals.add(meal);
       nameToGuest.put(name, guest);


   }


   public void displayPhoneNumber(){
       Integer phoneNumber = Integer.valueOf(scanner.nextLine());

       Guest guest = phoneToGuest.get(phoneNumber);

       guest.displayGuestsInformation();
   }

   public void displayGuests(){
       for(Guest guest : guests){
           guest.displayGuestsInformation();
       }
   }
   public void displayMeal() {
       for(String meal :meals){
           System.out.println(meals);
       }
   }

   public void displayName() {
       String name = scanner.nextLine();
       Guest guest = nameToGuest.get(name);
       guest.displayGuestsInformation();
   }

}
