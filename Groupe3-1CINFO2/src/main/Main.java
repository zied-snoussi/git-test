package main;

import entity.Operation;
import entity.Person;

public class Main {
        public static void main(String[] args) {
                System.out.println(
                                "\n++++++++++++++++++++++++++++++++++++++++++++Start+++++++++++++++++++++++++++++++++++++++++\n");

                // Creation of persons with diverse attributes
                Person p1 = new Person(1, "Ali", "Ahmed", 25, "Tunis", "12345678", "ali.ahmed@gmail.com", "012345678",
                                "123456789", "Developer", "Active", "I am a developer");
                Person p2 = new Person(2, "Mohamed", "Mohamed", 30, "Sfax", "87654321", "mohamed.mohamed@gmail.com",
                                "876543210", "987654321", "Designer", "Inactive", "I am a designer");
                Person p3 = new Person(3, "Salah", "Ali", 35, "Sousse", "11223344", "salah.ali@gmail.com", "44332211",
                                "556677889", "Manager", "Active", "I am a manager");

                // Initialize the operation with an array of persons
                Operation op = new Operation(new Person[] { p1, p2, p3 });

                // Display the list of persons
                op.afficherPersonnes();
                System.out.println(
                                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

                // Sort the persons in alphabetical order and display the sorted list
                System.out.println("Sort by alphabetical order:");
                op.trierParOrdreAlphabetique();
                op.afficherPersonnes();
                System.out.println(
                                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

                // Sort the persons by age and display the sorted list
                System.out.println("Sort by age:");
                op.trierParOrdreAge();
                op.afficherPersonnes();
                System.out.println(
                                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

                // Sort the persons in ascending order and display the sorted list
                System.out.println("Sort in ascending order:");
                op.trierParOrdreCroissant();
                op.afficherPersonnes();
                System.out.println(
                                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

                // Sort the persons in descending order and display the sorted list
                System.out.println("Sort in descending order:");
                op.trierParOrdreDecroissant();
                op.afficherPersonnes();
                System.out.println(
                                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
          
                // Check if various strings are palindromes
                System.out.println("Is '12321' a palindrome? " + Operation.estPalindrome("12321"));
                System.out.println("Is '123212' a palindrome? " + Operation.estPalindrome("123212"));
                System.out.println("Is 'racecar' a palindrome? " + Operation.estPalindrome("racecar"));
                System.out.println("Is 'hello' a palindrome? " + Operation.estPalindrome("hello"));
                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++End++++++++++++++++++++++++++++++++++\n");
        }
}
