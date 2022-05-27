package ro.Fasttrackit.FinalProject;

import java.util.List;

public class Product {
    private final String name;
    public String getCapaciti;
    private Integer weight;
    private List<Product> products;
    private double price;
    private final String description;

    public Product(String name, Integer weight, double price, String description) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.description = description;
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

    public void addProduct(Product producte) {
        products.add(producte);

    }

    public Product[] getProduct() {
        return null;
    }
}