package entity;

public class Operation {
    // Méthode pour trier un tableau d'entiers en ordre croissant
    public static void trierTableauCroissant(int[] tableau) {
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] > tableau[j]) {
                    int temp = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = temp;
                }
            }
        }
    }

    // Méthode pour vérifier si une chaîne est palindrome
    public static boolean estPalindrome(String chaine) {
        chaine = chaine.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = chaine.length();
        for (int i = 0; i < n / 2; i++) {
            if (chaine.charAt(i) != chaine.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
