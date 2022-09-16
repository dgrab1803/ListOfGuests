package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Party party = new Party();
        boolean exit = false;

        while (!exit) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Znajdź po imieniu");
            System.out.println("6. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice) {


                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeal();
                case 4 -> party.displayPhoneNumber();
                case 5 -> party.displayName();
                case 6 -> exit=true;

            }
        }
    }
}
