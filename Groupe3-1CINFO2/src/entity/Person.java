package entity;

// The Person class represents a person with various attributes
public class Person {
    // Declare the attributes of the Person class
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String telephone;
    private String email;
    private String cin;
    private String password;
    private String role;
    private String statut;
    private String description;

    // Constructor for the Person class
    public Person(int id, String nom, String prenom, int age, String adresse, String telephone, String email,
            String cin, String password, String role, String statut, String description) {
        // Initialize the attributes of the Person class
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.cin = cin;
        this.password = password;
        this.role = role;
        this.statut = statut;
        this.description = description;
    }

    // Getter and setter methods for the attributes of the Person class
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Override the toString method to display the Person object in a readable
    // format
    @Override
    public String toString() {
        return "Person [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse
                + ", telephone=" + telephone + ", email=" + email + ", cin=" + cin + ", password=" + password
                + ", role=" + role + ", statut=" + statut + ", description=" + description + "]";
    }

}