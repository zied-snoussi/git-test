package main;

import entity.Operation;

public class Main {
    public static void main(String[] args) {
        int[] tableau = { 5, 3, 8, 1, 2 };
        Operation.trierTableauCroissant(tableau);
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
        System.out.println(Operation.estPalindrome("12321"));
        System.out.println(Operation.estPalindrome("123212"));
    }
}