
package entity;
public class Dream {
    // Attributs
    private String description;
    private boolean isLucid;
    private int happinessLevel;

    // Constructeur
    public Dream(String description, boolean isLucid, int happinessLevel) {
        this.description = description;
        this.isLucid = isLucid;
        this.happinessLevel = happinessLevel;
    }

    // Getters et Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLucid() {
        return isLucid;
    }

    public void setLucid(boolean lucid) {
        isLucid = lucid;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    // Méthode pour afficher les informations du rêve
    public void display() {
        System.out.println("Description du rêve : " + description);
        System.out.println("Rêve lucide : " + (isLucid ? "Oui" : "Non"));
        System.out.println("Niveau de bonheur : " + happinessLevel);
    }
}
