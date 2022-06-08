package ro.Fasttrackit.FinalProject;


import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Product> orderList = new ArrayList<>();
    static List<Product> menuItemList = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        MenuStorage menuStorage = new MenuStorage();
        Integer menuID = 0;

        menuItemList.add(new Product(++menuID,"Coca-Cola", null, 2.32, "carbonated", false));
        menuItemList.add(new Product(++menuID,"Fanta", null, 3.44, "carbonated", false));
        menuItemList.add(new Product(++menuID,"Capyy", null, 4.4, "non cabonated", false));

        System.out.println("   ");
        menuItemList.add(new Product(++menuID,"Espresso", null, 2.32, "coffe from Columbia ", false));
        menuItemList.add(new Product(++menuID,"Cappuccino", null, 3.44, "coffe from Egipt and milk natural",false));
        menuItemList.add(new Product(++menuID,"Latte Macchiato", null, 4.4, "coffe from USA and alomd milk",false));


        System.out.println("   ");
        menuItemList.add(new Product(++menuID,"stew meat", 1, 24.32, "let your mouth water - price per 100gr, please choose grams",true));
        menuItemList.add(new Product(++menuID,"potatoes ", 1, 34.44, "let your mouth water",true));
        menuItemList.add(new Product(++menuID,"vegetarian food", 1, 16.4, "let your mouth water",true));

        System.out.println("   ");
        menuItemList.add(new Product(++menuID,"pancakes", 1, 14.32, "very good",false));
        menuItemList.add(new Product(++menuID,"mix fruit", 1, 10.44, "very good",false));
        menuItemList.add(new Product(++menuID,"apple cake", 1, 9.4, "very good",false));
        menuStorage.write(menuItemList);

        for (Product menuItemproduct : menuItemList) {
            System.out.println(menuItemproduct.displayInFile());
        }

        int userCommandKey = 0;
        do {
            System.out.println(" " +
                    "1. Adauga Produs \n " +
                    "2. Vizualizeaza comanda \n " +
                    "3. Plaseaza comanda \n " +
                    "4. Cheama ospatar \n " +
                    "5. Cere Nota \n " +
                    "6. Zona feedback \n " +
                    "7. Exit");

            userCommandKey = readInputValue();
            switch (userCommandKey) {
                case 1:
                    System.out.println("Alege produsul din meniu folosind numarul produsului");
                    createOrder();
                    break;
                case 2:
                    System.out.println("Comanda dumneavoastra:");
                    showOrderList();
                    break;
                case 3:
                    System.out.println("Plaseaza comnda");
                    break;
                case 4:
                    System.out.println("Cheama ospatar");
                    break;
                case 5:
                    System.out.println("Cere nota");
                    break;
                case 6:
                    System.out.println("Zona de feeadback");
                    break;
            }
        } while (userCommandKey < 7);


        menuStorage.closeFile();
    }

    public static int readInputValue() {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        return numb;
    }

    public static void createOrder() {
        int menuItemID = 0;
        do {
            menuItemID = readInputValue();
            switch (menuItemID) {
                case 0:
                    break;
                 default:
                     if(menuItemList.get(menuItemID - 1).isPerQuantity()) {
                         System.out.println("Adauga numarul de portii");
                         int portions = readInputValue();
                         Product product = menuItemList.get(menuItemID - 1);
                         product.setPortions(portions);
                         orderList.add(product);
//                         orderList.add(menuItemList.get(menuItemID - 1));

                     } else {
                         orderList.add(menuItemList.get(menuItemID - 1));
                     }
                     System.out.println("Adauga alt produs sau 0 ca sa te intorci la meniul anterior");
                    break;
            }
        } while (menuItemID > 0);
    }

    public static void showOrderList() {
        double intermediarPrice = 0d;
        for (Product product : orderList) {
            if(product.isPerQuantity()) {
                intermediarPrice += product.getPrice() * product.getPortions();
            } else {
                intermediarPrice += product.getPrice();
            }
            System.out.println(product.displayInFile());
        }
        System.out.println("Current price: "+ intermediarPrice);
    }
}

