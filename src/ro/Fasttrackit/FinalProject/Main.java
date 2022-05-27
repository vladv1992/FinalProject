package ro.Fasttrackit.FinalProject;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product juice = new Product("Coca-Cola", null, 2.32, "carbonated");
        Product juice1 = new Product("Fanta", null, 3.44, "carbonated");
        Product juice2 = new Product("Capyy", null, 4.4, "non cabonated");
        Product caffee = new Product("Espresso", null, 2.32, "coffe from Columbia ");
        Product caffee1 = new Product("Cappuccino", null, 3.44, "coffe from Egipt and milk natural");
        Product caffee2 = new Product("Latte Macchiato", null, 4.4, "coffe from USA and alomd milk");
        Product food = new Product("stew meat", 1, 24.32, "let your mouth water");
        Product food1 = new Product("mix fruit", 1, 10.44, "very good");
        Product food2 = new Product("vegetarian food", 1, 16.4, "let your mouth water");
        Product dessert = new Product("apple cake", 1, 9.4, "very good");
        Product dessert1 = new Product("mix fruit", 1, 10.44, "very good");
        Product dessert2 = new Product("apple cake", 1, 9.4, "very good");

        list.add(juice);
        list.add(juice1);
        list.add(juice2);
        list.add(caffee);
        list.add(caffee1);
        list.add(caffee2);
        list.add(food);
        list.add(food1);
        list.add(food2);
        list.add(dessert);
        list.add(dessert1);
        list.add(dessert2);

        for (Product product : list) {
            System.out.println(product.getName() + "|" + product.getWeight() + "|" + product.getPrice() + "|" + product.getDescription());
        }
//        MenuStorage menuStorage = new MenuStorage();
//        menuStorage.write(juice);

//
//        juice.add(new Product("Coca-Cola", null, 2.32, "carbonated"));
//        juice.add(new Product("Fanta", null, 3.44, "carbonated"));
//        juice.add(new Product("Capyy", null, 4.4, "non cabonated"));
//
//        for (Product p : juice) {
//            System.out.println(p.getName() + " " + p.getWeight() + " " + p.getPrice() + " " + p.getDescription());
//
//        }
//        System.out.println("   ");
//        List<Product> coffee = new ArrayList<>();
//        coffee.add(new Product("Espresso", null, 2.32, "coffe from Columbia "));
//        coffee.add(new Product("Cappuccino", null, 3.44, "coffe from Egipt and milk natural"));
//        coffee.add(new Product("Latte Macchiato", null, 4.4, "coffe from USA and alomd milk"));
//
//        for (Product c : coffee) {
//            System.out.println(c.getName() + " " + c.getWeight() + " " + c.getPrice() + " " + c.getDescription());
//        }
//
//        System.out.println("   ");
//        List<Product> food = new ArrayList<>();
//        food.add(new Product("stew meat", 1, 24.32, "let your mouth water"));
//        food.add(new Product("potatoes ", 1, 34.44, "let your mouth water"));
//        food.add(new Product("vegetarian food", 1, 16.4, "let your mouth water"));
//
//        for (Product c : food) {
//            System.out.println(c.getName() + " " + c.getWeight() + " " + c.getPrice() + " " + c.getDescription());
//        }
//        System.out.println("   ");
//        List<Product> dessert = new ArrayList<>();
//        dessert.add(new Product("pancakes", 1, 14.32, "very good"));
//        dessert.add(new Product("mix fruit", 1, 10.44, "very good"));
//        dessert.add(new Product("apple cake", 1, 9.4, "very good"));
//
//        for (Product c : dessert) {
//            System.out.println(c.getName() + " " + c.getWeight() + " " + c.getPrice() + " " + c.getDescription());
//        }


    }
}
