package entity;

// Class to perform operations on Person objects
public class Operation {
    // Array of Person objects
    private Person[] persons;

    // Getter for persons
    public Person[] getPersons() {
        return persons;
    }

    // Setter for persons
    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    // Constructor for Operation class
    public Operation(Person[] persons) {
        this.persons = persons;
    }

    // Method to sort persons by name in alphabetical order
    public Person[] trierParOrdreAlphabetique() {
        Person[] personnes = this.getPersons();
        int n = personnes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (personnes[i].getNom().compareTo(personnes[j].getNom()) > 0) {
                    Person temp = personnes[i];
                    personnes[i] = personnes[j];
                    personnes[j] = temp;
                }
            }
        }
        return personnes;
    }

    // Method to sort persons by age in ascending order
    public Person[] trierParOrdreAge() {
        Person[] personnes = this.getPersons();
        int n = personnes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (personnes[i].getAge() > personnes[j].getAge()) {
                    Person temp = personnes[i];
                    personnes[i] = personnes[j];
                    personnes[j] = temp;
                }
            }
        }
        return personnes;
    }

    // Method to sort persons by ID in ascending order
    public Person[] trierParOrdreCroissant() {
        Person[] personnes = this.getPersons();
        int n = personnes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (personnes[i].getId() > personnes[j].getId()) {
                    Person temp = personnes[i];
                    personnes[i] = personnes[j];
                    personnes[j] = temp;
                }
            }
        }
        return personnes;
    }

    // Method to sort persons by ID in descending order
    public Person[] trierParOrdreDecroissant() {
        Person[] personnes = this.getPersons();
        int n = personnes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (personnes[i].getId() < personnes[j].getId()) {
                    Person temp = personnes[i];
                    personnes[i] = personnes[j];
                    personnes[j] = temp;
                }
            }
        }
        return personnes;
    }

    // Method to display all persons
    public void afficherPersonnes() {
        Person[] personnes = this.getPersons();
        System.out.println("---------------------------------------------------------------");
        for (Person personne : personnes) {
            System.out.println(personne);
            System.out.println("---------------------------------------------------------------");
        }
    }

    // Method to check if a string is a palindrome
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