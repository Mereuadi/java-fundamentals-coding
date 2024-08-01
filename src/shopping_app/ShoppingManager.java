package shopping_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *Keyword STATIC
 * - se foloseste pentru: proprietati, metode, clase (nu se foloseste pentru constructori)
 * - atunci cand o proprietate/variabila/clasa/metoda este statica, se aloca spatiu in memorie la pornirea aplicatiei
 * - intr-o metoda statica NU putem apela proprietati (variabile) care nu sunt statice
 * - pentru a apela o proprietate/metoda/clasa statica, folosim NUMELE CLASEI . NUMELE PROPRIETATII/METODEI/CLASEI=> Dog.bark() nu folosim instanta clasei, adica rex.bark()
 * - elementele statice sunt independente de obiecte, acestea depind de clasa, nu de instanta lor
 */

public class ShoppingManager {

    //Proprietati :
    static List<String> itemsList = new ArrayList<>();

    //Constructori
    //Metode


    public void start() {
        System.out.println("Shopping List App");

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            showMenu();

            String option = scanner.next();
            scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Introduceti un element");
                    String item = scanner.nextLine();
                    addItem(item);

                case "2":
                    System.out.println("Introduceti itemul de modificat");

                    String oldItem = scanner.nextLine();
                    System.out.println("Introduceti itemul modificat");
                    String newItem = scanner.nextLine();
                    updateItem(oldItem, newItem);
                    break;

                case "3":
                    System.out.println("Introduceti un item pentru stergere");
                    String itemForDelete = scanner.nextLine();
                    deleteItem(itemForDelete);
                    break;
                case "4":
                    showItemsList();
                    break;
                case "5":
                    itemsList.clear();
                    break;
                case "6":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Optiunea nu exista");


            }

            // variabila item de mai sus stocheaza ce citim de la tastatura
            // Metoda addItem() primeste ca si parametru o variabila de tip String, aceasta variabila contine valoarea cititta de la tastatura.
            // addItem(item) prin aceasta linie trimitem valoarea citita din metoda start(), in metoda addItem().

        }
    }

    private void showMenu() {
        System.out.println("1. Introducere element:");
        System.out.println("2. Modificare element");
        System.out.println("3. Stergere element");
        System.out.println("4. Afisare lista");
        System.out.println("5. Golire lista");
        System.out.println("6. Oprire");

    }

    public void addItem(String item) {
        boolean isPresent = isPresentInList(item);

        if (isPresent == true) {
            System.out.println("Elementul exista in lista .");
        } else {
            itemsList.add(item);
        }
    }

    public void updateItem() {

    }

    public void deleteItem(String item) {
        boolean isPresent = isPresentInList(item);

        if (isPresent == true) {
            itemsList.remove(item);
        } else {
            System.out.println("Elementul nu a fost gasit.");
        }
    }

    public boolean isPresentInList(String item) {
        boolean isPresent = false;

        for (int i = 0; i < itemsList.size(); i++) {
            String element = itemsList.get(i);

            if (item.equalsIgnoreCase(element)) {

                isPresent = true;
            }

        }
        return isPresent;
    }

    public void showItemsList() {
        for (int i = 0; i < itemsList.size(); i++) {
            String element = itemsList.get(i);

            System.out.println(element);
        }
    }

    public void updateItem(String oldItem, String newItem) {
        // varianta 1
        // deleteItem(oldItem);
        // addItem(newItem);

        // varianta 2
        boolean isPresent = isPresentInList(oldItem);
        if (isPresent == false) {
            System.out.println("Elementul nu se afla in lista");
        } else {
            for (int i = 0; i < itemsList.size(); i++) {
                String element = itemsList.get(i);

                if (oldItem.equalsIgnoreCase(element)) {
                    // metoda set ne ajuta sa modificam un element de pe o pozitie anume (index)
                    itemsList.set(i, newItem);
                }
            }
        }


    }
}