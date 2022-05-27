package ro.Fasttrackit.FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuInsite{
    public int getCapaciti;
   private final List<Product> products;

    public int getGetCapaciti() {
        return getCapaciti;
    }

    public void setGetCapaciti(int getCapaciti) {
        this.getCapaciti = getCapaciti;
    }


    public void addProduct(Product producte) {
        products.add(producte);
    }

    public List<Product> getProducts() {
        return products;
    }

    public MenuInsite(){
       products = new ArrayList<>();
   }

    public List<Product> getProduct() {
        return Collections.unmodifiableList(products);
    }

//    public void addProduct(Product product){
//        products.add(product);
//
//    }

    @Override
    public String toString() {
        return "MenuInsite{" +
                "products=" + products +
                '}';
    }
}
