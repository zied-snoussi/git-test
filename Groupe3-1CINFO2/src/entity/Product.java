package entity;

public class Product {
    // Attributs
    private String name;
    private double price;
    private int quantity;

    // Constructeur
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Méthodes
    // Méthode pour calculer le prix total du produit en fonction de la quantité
    public double getTotalPrice() {
        return price * quantity;
    }

    // Méthode pour augmenter la quantité de produit
    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    // Méthode pour diminuer la quantité de produit
    public void decreaseQuantity(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Quantité insuffisante.");
        }
    }

    // Méthode pour afficher les détails du produit
    public void display() {
        System.out.println("Nom du produit: " + name);
        System.out.println("Prix du produit: " + price);
        System.out.println("Quantité en stock: " + quantity);
    }

    // Méthode principale pour tester la classe Product
    public static void main(String[] args) {
        // Création d'un objet Product
        Product product = new Product("Ordinateur portable", 999.99, 10);

        // Affichage des détails du produit
        product.display();

        // Calcul et affichage du prix total pour 5 produits
        int quantityToBuy = 5;
        double totalPrice = product.getTotalPrice();
        System.out.println("Prix total pour " + quantityToBuy + " produits: " + totalPrice);

        // Augmentation de la quantité de produit et affichage mis à jour
        product.increaseQuantity(5);
        product.display();

        // Diminution de la quantité de produit et affichage mis à jour
        product.decreaseQuantity(3);
        product.display();
    }
}
