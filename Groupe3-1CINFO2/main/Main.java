package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int n = sc.nextInt();
        System.out.println("Entrez un nombre : ");
        int m = sc.nextInt();
        System.out.println("Le produit de " + n + " par " + m + " est " + (n * m));
    }
}