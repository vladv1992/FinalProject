package ro.Fasttrackit.FinalProject;

import java.util.List;

public class Product {

    private Integer productMenuID;
    private final String name;
    private Integer portions;
    private Integer weight;
    private List<Product> products;
    private double price;
    private final String description;

    private boolean perQuantity;

    public Integer getPortions() {
        return portions;
    }

    public void setPortions(Integer portions) {
        this.portions = portions;
    }

    public Product(Integer productMenuID, String name, Integer weight, double price, String description, boolean perQuantity) {
        this.productMenuID = productMenuID;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.description = description;
        this.perQuantity = perQuantity;
        this.portions = 0;
    }

    public Integer getProductMenuID() {
        return productMenuID;
    }

    public void setProductMenuID(Integer productMenuID) {
        this.productMenuID = productMenuID;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;

    }

    public Integer getWeight() {
        return weight;
    }

    public void changeWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public String displayInFile() {
        return this.productMenuID + "." + this.name + "|" + this.weight + "|" + this.price + "|" + this.description;
    }

    public void addProduct(Product producte) {
        products.add(producte);

    }

    public Product[] getProduct() {
        return null;
    }

    public boolean isPerQuantity() {
        return perQuantity;
    }

    public void setPerQuantity(boolean perQuantity) {
        this.perQuantity = perQuantity;
    }
}